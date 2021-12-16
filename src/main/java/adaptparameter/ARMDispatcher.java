package adaptparameter;

import lombok.Value;

@Value
public class ARMDispatcher {
    MarketBinding marketBindings;
    String pageStateName;


    public void populate(ParameterSource source) {
        String value = source.getParameterForName(pageStateName);
        if (value != null) {
            marketBindings.put(pageStateName + getDateStamp(), value);
        }
    }


    private String getDateStamp() {
        return null;
    }
}
