import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class VendingMachineKata {
    private Double currentValue = 0D;

    private final static Map<String, Double> coins = new HashMap<>();
    static {
        coins.put("NICKEL", .05);
        coins.put("DIME", .10);
        coins.put("QUARTER", .25);
    }

    public String getDisplayText() {
        return currentValue == 0 ? "INSERT COIN" : NumberFormat.getCurrencyInstance().format(currentValue);
    }

    public void insertCoin(String coin) {
        Double value = coins.get(coin);

        if (value != null) {
            currentValue += value;
        }
    }
}
