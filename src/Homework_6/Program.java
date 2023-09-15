package Homework_6;

public class Program {
    public static void main(String[] args) {

        OrderConsole order = new OrderConsole(new Order());
        order.input();
        OrderJson orderJson = new OrderJson();
        orderJson.save(order.getOrder());
    }
}
