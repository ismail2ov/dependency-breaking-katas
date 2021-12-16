package adaptparameter;

import java.util.HashMap;
import java.util.Map;

public class MarketBinding {
    private final Map<String, String> market = new HashMap<>();

    public void put(String key, String value) {
        this.market.put(key, value);
    }

    public String getMarket(String key) {
        return market.getOrDefault(key, "");
    }
}
