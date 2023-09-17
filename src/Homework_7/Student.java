package Homework_7;


public class Student extends Resume implements Observer {

    public Student(String name, String surName, int age, String vacancy, int experience, int salary) {
        super(name, surName, age, vacancy,experience, salary);
        setSalary(salary);
    }

    @Override
    public void receiveOffer(String nameCompany, String vacancy, int experience, int salary) {
        if (getSalary() <= salary && getVacancy().equals(vacancy) && getExperience() == experience && isActive()){
            System.out.printf("Студент %s %s: Мне нужна эта работа! (компания: %s; " +
                            "вакансия: %s; опыт: %d; заработная плата: %d)\n",
                    getSurName(), getName(), nameCompany, vacancy, experience, salary);
            setActive(false);
        }
        else {
            System.out.printf("Студент %s %s : Я найду работу получше! (компания: %s; " +
                            "вакансия: %s; опыт: %d; заработная плата: %d)\n",
                    getSurName(), getName(), nameCompany, vacancy, experience, salary);
        }
    }

    @Override
    public String toString() {
        return String.format("Студент %s %s; Возраст %d; Вакансия %s; Опыт: %d; Зарплата %d",
                getSurName(), getName(), getAge(), getVacancy(), getExperience(), getSalary());
    }
}
