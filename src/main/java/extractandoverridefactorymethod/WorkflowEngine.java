package extractandoverridefactorymethod;

public class WorkflowEngine {

    private TransactionManager tm;

    public WorkflowEngine() {
        tm = createTransactionManager();
    }

    protected TransactionManager createTransactionManager() {
        final TransactionManager tm;
        Reader reader = new ModelReader(AppConfig.getDryConfiguration());
        Persister persister = new XMLStore(AppConfiguration.getDryConfiguration());

        return new TransactionManager(reader, persister);
    }
}
