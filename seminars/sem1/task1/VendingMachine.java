package sem1.task1;

import java.util.List;

public class VendingMachine {
    List<Product> productList;
    Integer money;

    public Product getProduct(String name) {
        for (Product product: productList) {
            if (product.name.equals(name)) {
                money += product.price;
                return  product;
            }
        }
        return null;
    }



}
