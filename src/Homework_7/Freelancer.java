package Homework_7;

public class Freelancer extends Resume implements Observer {
    public Freelancer(String name, String surName, int age, String vacancy, int experience, int salary) {
        super(name, surName, age, vacancy, experience, salary);
    }
    @Override
    public void receiveOffer(String nameCompany, String vacancy, int experience, int salary) {
        if (getSalary() <= salary && getVacancy().equals(vacancy) && getExperience() == experience && isActive()){
            System.out.printf("Фрилансер %s %s: Мне нужна эта работа! (компания: %s; " +
                            "вакансия: %s; опыт: %d; заработная плата: %d)\n",
                    getSurName(), getName(), nameCompany, vacancy, experience, salary);
            setActive(false);
        }
        else {
            System.out.printf("Фрилансер %s %s: Я найду работу получше! (компания: %s; " +
                            "вакансия: %s; опыт: %d; заработная плата: %d)\n",
                    getSurName(), getName(), nameCompany, vacancy, experience, salary);
        }
    }

    @Override
    public String toString() {
        return String.format("Фрилансер %s %s; Возраст %d; Вакансия %s; Опыт: %d; Зарплата %d",
                getSurName(), getName(), getAge(), getVacancy(), getExperience(), getSalary());
    }
}
