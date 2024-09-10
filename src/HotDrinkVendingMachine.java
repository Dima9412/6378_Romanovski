import java.util.HashMap;
import java.util.Map;

public class HotDrinkVendingMachine implements VendingMachine {
    private Map<Integer, HotDrinkWithTemperature> drinks = new HashMap<>();

    public HotDrinkVendingMachine() {
        // Initialize drinks
        drinks.put(1, new HotDrinkWithTemperature("Tea", 250, 80));
        drinks.put(2, new HotDrinkWithTemperature("Coffee", 200, 90));
    }

    public HotDrink getProduct(int name, int volume, int temperature) {
        HotDrinkWithTemperature drink = drinks.get(name);
        if (drink != null && drink.getVolume() == volume && drink.getTemperature() == temperature) {
            return drink;
        }
        return null; // If drink is not found or parameters do not match
    }

    @Override
    public HotDrink getProduct(int name, int volume) {
        return null;
    }
}
