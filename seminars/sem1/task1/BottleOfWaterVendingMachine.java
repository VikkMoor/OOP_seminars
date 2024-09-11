package sem1.task1;

import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {

    private final List<Product> productList;
    private int money;

    public BottleOfWaterVendingMachine(List<Product> productList) {
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

}
