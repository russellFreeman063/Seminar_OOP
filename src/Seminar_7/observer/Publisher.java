package Seminar_7.observer;

public interface Publisher {

    void sendOffer(String companyName, int salary);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

}
