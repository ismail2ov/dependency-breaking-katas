package extractinterface;

public class PaydayTransaction implements Transaction {
    private PayrollDatabase database;
    private TransactionRecorder log;

    public PaydayTransaction(PayrollDatabase database, TransactionRecorder log) {
        this.database = database;
        this.log = log;
    }

    public void run() {
        // process
        this.log.saveTransaction(this);
    }
}
