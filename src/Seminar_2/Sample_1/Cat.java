package Seminar_2.Sample_1;

public class Cat extends Animal {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает.");
    }

    @Override
    public void voice() {
        System.out.println("Кот мяукает.");
    }
}
