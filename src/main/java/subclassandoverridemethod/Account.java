package subclassandoverridemethod;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Account {

    private double balance;
    private Date lastTransactionDate;
    private final ArrayList<Transaction> transactionList;

    public Account() {
        this.balance = 0;
        this.lastTransactionDate = null;
        this.transactionList = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public Date getLastTransactionDate() {
        return lastTransactionDate;
    }

    public void credit(double amount) {
        transaction(-amount);
    }

    public void debit(double amount) {
        transaction(amount);
    }

    private void updateBalance(double amount) {
        balance += amount;
    }

    private void transaction(double amount) {
        updateBalance(amount);
        registerTransaction(amount);
    }

    private void registerTransaction(double amount) {
        Date date = getDate();
        transactionList.add(new Transaction(date, -amount));
        lastTransactionDate = date;
    }

    protected Date getDate() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }
}