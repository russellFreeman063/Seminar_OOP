package Homework_4;
public class Program {

    public static void main(String[] args) {

        Box<Apple> boxApple1 = new Box<>();
        for (int i = 0; i < 3; i++) {
            boxApple1.addFruct(new Apple());
        }

        Box<Orange> boxOrange1 = new Box<>();
        for (int i = 0; i < 2; i++) {
            boxOrange1.addFruct(new Orange());
        }

        Box<Apple> boxApple2 = new Box<>();
        boxApple1.transfer(boxApple2);

        System.out.println(boxOrange1.getWeight());
        System.out.println(boxApple2.getWeight());

        System.out.println(boxOrange1.compare(boxApple2));

    }

}
