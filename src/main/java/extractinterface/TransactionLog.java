package extractinterface;

public class TransactionLog {

    public void saveTransaction(Transaction transaction) {
        // save transaction
        throw new RuntimeException("Error saving transaction");
    }

    public void recordError(int code) {
        // record error
    }
}
