package nivell1;

import java.util.ArrayList;
import java.util.List;

public class Sale {

    private List<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void calculateTotal() {
        if (products.isEmpty()) {
            throw new EmptySaleException(
                    "Per fer una venda primer has d’afegir productes"
            );
        }

        totalPrice = 0.0;

        for (Product product : products) {
            totalPrice += product.getPrice();
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
