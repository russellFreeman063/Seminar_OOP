package Homework_2;

public class Program {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 2, 5),
                new Cat("Вася", 5, 10),
                new Cat("Том", 1, 3),
                new Cat("Кекс", 5, 8),
                new Cat("Феликс", 2, 2)}; // Создание массива котов.

        Plate plate = new Plate(10); // Создание тарелки с едой.
        plate.addFood(10); // Добавление еды в тарелку.

        for (Cat cat: cats) {
            if (cat.getAppetite() <= plate.getFood()) {
                cat.eat();
                plate.setFood(plate.getFood() - cat.getAppetite());
                System.out.println(cat.getName() + " поел из тарелки. В тарелке осталось: " + plate.getFood());
            }
            else {
                if (plate.getFood() == 0) {
                    System.out.println(cat.getName() + " не поел. Тарелка пуста");
                }
                else {
                    System.out.println(cat.getName() + " не поел. В тарелке не хватило еды");
                }
            }
        }
        System.out.println();
        for (Cat cat: cats) {
            System.out.println(cat.getInfo());
        }
    }
}
