package extractinterface;

public class FakeTransactionLog implements TransactionRecorder {
    @Override
    public void saveTransaction(Transaction transaction) {

    }

    @Override
    public void recordError(int code) {

    }
}
