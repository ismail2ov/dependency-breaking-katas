package extractinterface;

public class PaydayTransaction implements Transaction {
    private PayrollDatabase database;
    private TransactionLog log;

    public PaydayTransaction(PayrollDatabase database, TransactionLog log) {
        this.database = database;
        this.log = log;
    }

    public void run() {
        // process
        this.log.saveTransaction(this);
    }
}
