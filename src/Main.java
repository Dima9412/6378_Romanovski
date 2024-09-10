public class Main {
    public static void main(String[] args) {
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();

        // Request a drink
        HotDrink drink1 = vendingMachine.getProduct(1, 250, 80);
        if (drink1 != null) {
            System.out.println("You received: " + drink1);
        } else {
            System.out.println("Drink not found.");
        }

        HotDrink drink2 = vendingMachine.getProduct(2, 200, 90);
        if (drink2 != null) {
            System.out.println("You received: " + drink2);
        } else {
            System.out.println("Drink not found.");
        }

        // Try to get a drink with incorrect parameters
        HotDrink drink3 = vendingMachine.getProduct(1, 200, 80);
        if (drink3 != null) {
            System.out.println("You received: " + drink3);
        } else {
            System.out.println("Drink not found.");
        }
    }
}