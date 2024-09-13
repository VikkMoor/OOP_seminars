package sem1.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> drinks = new ArrayList<>();
        drinks.add(new HotDrink("Tea", 20, 200, 75));
        drinks.add(new HotDrink("Coffee", 30, 250, 70));
        drinks.add(new HotDrink("Hot Chocolate", 40, 300, 65));
        HotDrinkVendingMachine test = new HotDrinkVendingMachine(drinks, 500);
        System.out.println(test);
        System.out.println(test.getProduct("Tea", 200, 75));
    }

}
