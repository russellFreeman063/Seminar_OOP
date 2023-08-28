package Homework_1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product chocolate1 = new Chocolate("Шоколад", "Mars", 110, 100);
        Product chocolate2 = new Chocolate("Шоколад", "Snickers", 120, 150);
        Product chocolate3 = new Chocolate("Шоколад", "Алёнка", 150, 200);

        List<Product> products = new ArrayList<>();
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);

        VendingMachine vendingMachine = new VendingMachine(products);
        Chocolate chocolate = vendingMachine.getChocolate("Шоколад", 200);
        if (chocolate != null) {
            System.out.println("Вы получили: ");
            System.out.println(chocolate.displayInfo());
        } else {
            System.out.println("Такого шоколада нет в автомате.");
        }
    }
}
