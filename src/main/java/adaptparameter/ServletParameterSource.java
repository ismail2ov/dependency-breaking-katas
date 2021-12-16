package adaptparameter;

import javax.servlet.http.HttpServletRequest;

public class ServletParameterSource implements ParameterSource {
    private final HttpServletRequest request;

    public ServletParameterSource(HttpServletRequest request) {
        this.request = request;
    }

    @Override
    public String getParameterForName(String name) {
        String [] values = request.getParameterValues(name);
        if (values == null || values.length < 1) {
            return null;
        }

        return values[0];
    }
}
