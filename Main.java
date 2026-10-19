package nivell1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sale sale = new Sale();

        // Test 1: Calculate a sale without products
        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        // Test 2: Add products and calculate the total
        sale.addProduct(new Product("Book", 12.50));
        sale.addProduct(new Product("Pen", 2.00));

        sale.calculateTotal();
        System.out.println("Total price: " + sale.getTotalPrice());

        // Test 3: Access an invalid list position
        List<String> items = new ArrayList<>();
        items.add("Book");

        try {
            System.out.println(items.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
