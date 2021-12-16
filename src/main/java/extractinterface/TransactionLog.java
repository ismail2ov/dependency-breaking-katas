package extractinterface;

public class TransactionLog implements TransactionRecorder {

    @Override
    public void saveTransaction(Transaction transaction) {
        // save transaction
        throw new RuntimeException("Error saving transaction");
    }

    @Override
    public void recordError(int code) {
        // record error
    }
}
