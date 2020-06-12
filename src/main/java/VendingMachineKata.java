import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class VendingMachineKata {
    private String display = "INSERT COIN";
    private static int currentValue;

    private final static Map<String, Double> coins = new HashMap<>();
    static {
        coins.put("NICKEL", .05);
    }

    public String getDisplayText() {
        return display;
    }

    public void insertCoin(String coin) {
        Double value = coins.get(coin);

        if (value != null) {
            display = value.toString();
        }
    }
}
