package sem1.task1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> productList;
    private Integer money;

    public VendingMachine(List<Product> productList, Integer money) {
        this.productList = productList;
        this.money = 0;
    }

    public Product getProduct(String name) {
        for (Product product: productList) {
            if (product.getName().equals(name)) {
                money += product.getPrice();
                return  product;
            }
        }
        return null;
    }

    private List<Product> initProduct() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Milk", 100));
        products.add(new Product("Water", 50));
        products.add(new Product("Kirieshki", 30));
        return products;
    }

}
