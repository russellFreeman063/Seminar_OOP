package Homework_6;

import java.util.Scanner;

public class OrderConsole {
    private Order order;

    public void input() {
        order.setClientName(prompt("Client name: "));
        order.setProduct(prompt("Product: "));
        order.setQnt(Integer.parseInt(prompt("Quantity: ")));
        order.setPrice(Integer.parseInt(prompt("Price: ")));
    }

    public OrderConsole(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}