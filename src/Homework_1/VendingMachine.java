package Homework_1;

import java.util.List;

public class VendingMachine {
    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Chocolate getChocolate(String name, int calories){
        for (Product product : products) {
            if (product instanceof Chocolate chocolate){
                if (chocolate.getName().equals(name) && chocolate.getCalories() == calories){
                    return chocolate;
                }
            }
        }
        return null;
    }
}
