package Homework_7;

public class Resume {
    private String name;
    private String surName;
    private int age;
    private String vacancy;
    private int experience;
    private int salary;
    private boolean active;


    public Resume(String name, String surName, int age, String vacancy, int experience, int salary) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.vacancy = vacancy;
        this.experience = experience;
        this.salary = salary;
        this.active = true;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVacancy() {
        return vacancy;
    }

    public void setVacancy(String vacancy) {
        this.vacancy = vacancy;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String toString() {
        return String.format("%s %s; Возраст %d; Вакансия %s; Опыт: %d; Зарплата %d",
                surName, name, age, vacancy, experience, salary);
    }
}