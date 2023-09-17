package Homework_7;

public interface Publisher {

    void sendOffer(String companyName,String vacancy, int experience, int salary);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

}
