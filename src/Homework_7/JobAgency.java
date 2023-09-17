package Homework_7;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void sendOffer(String companyName, String vacancy, int experience,  int salary) {
        for (Observer observer : observers){
            observer.receiveOffer(companyName, vacancy, experience, salary);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
