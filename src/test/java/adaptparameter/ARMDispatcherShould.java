package adaptparameter;

import org.junit.jupiter.api.Test;

class ARMDispatcherShould {

    @Test
    void populate() {
        ARMDispatcher dispatcher = new ARMDispatcher(new MarketBinding(), "");
        ParameterSource source = new FakeParameterSource();
        dispatcher.populate(source);
    }
}