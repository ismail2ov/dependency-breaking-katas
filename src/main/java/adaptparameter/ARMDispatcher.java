package adaptparameter;

import javax.servlet.http.HttpServletRequest;

public class ARMDispatcher {

    private String pageStateName;
    private MarketBinding marketBindings;

    public void populate(HttpServletRequest request) {
        String[] values = request.getParameterValues(pageStateName);
        if (values != null && values.length > 0) {
            marketBindings.put(pageStateName + getDateStamp(), values[0]);
        }
    }


    private String getDateStamp() {
        return null;
    }
}
