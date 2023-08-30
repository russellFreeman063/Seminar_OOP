package Homework_2;

public class Cat extends Animal {
    private int appetite;
    private boolean satiety;

    public Cat(String name, int age, int appetite) {
        super(name, age);
        this.appetite = appetite;
        this.satiety = false;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public String isSatiety() {
        if (satiety) {
            return "Сыт";
        }
        else {
            return "Голоден";
        }
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat() {
        setSatiety(true);
    }

    @Override
    public String getInfo() {
        return String.format("[Кот] %s - %d, аппетит: %d (%s)", name, age, appetite, isSatiety());
    }
}
