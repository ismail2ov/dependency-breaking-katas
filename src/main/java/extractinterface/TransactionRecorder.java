package extractinterface;

public interface TransactionRecorder {
    void saveTransaction(Transaction transaction);

    void recordError(int code);
}
