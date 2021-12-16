package adaptparameter;

public class FakeParameterSource implements ParameterSource {

    @Override
    public String getParameterForName(String name) {
        return "mock value";
    }
}
