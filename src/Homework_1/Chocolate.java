package Homework_1;

public class Chocolate extends Product {
    private int calories;

    public Chocolate(String name, String brand, double price, int calories){
        super(name, brand, price);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String displayInfo() {
        return String.format("%s - %s - %.2f - c: %d", name, brand, price, calories);
    }
}
