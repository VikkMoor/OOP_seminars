package sem1.task1;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private final List<Product> productList;
    private int money;

    public HotDrinkVendingMachine(List<Product> productList, int money) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product: productList) {
            if (product.getName().equals(name)) {
                money += product.getPrice();
                return  product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "HotDrinkVendingMachine{" +
                "productList=" + productList +
                ", money=" + money +
                '}';
    }

    public HotDrink getProduct(String name, int volume, int temp) {
        for (Product product: productList) {
            if (product instanceof HotDrink) {
                if (product.getName().equals(name) && ((HotDrink) product).getVolume() == volume && ((HotDrink) product).getTemp() == temp) {
                    return (HotDrink) product;
                }
            }
        }
        return null;
    }
}
