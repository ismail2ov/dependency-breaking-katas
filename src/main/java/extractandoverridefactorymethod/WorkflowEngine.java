package extractandoverridefactorymethod;

public class WorkflowEngine {

    private final TransactionManager tm;

    public WorkflowEngine() {
        Reader reader = new ModelReader(AppConfig.getDryConfiguration());
        Persister persister = new XMLStore(AppConfiguration.getDryConfiguration());

        this.tm = new TransactionManager(reader, persister);
    }
}
