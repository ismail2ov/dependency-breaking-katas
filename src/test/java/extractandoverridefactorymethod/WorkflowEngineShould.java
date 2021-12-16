package extractandoverridefactorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkflowEngineShould {

    @Test
    void create_instance() {
        WorkflowEngine workflowEngine = new TestableWorkflowEngine();
    }
}