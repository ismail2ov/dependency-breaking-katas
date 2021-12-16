package extractandoverridefactorymethod;

public class TestableWorkflowEngine extends WorkflowEngine {
    @Override
    protected TransactionManager createTransactionManager() {
        return new FakeTransactionManager();
    }
}
