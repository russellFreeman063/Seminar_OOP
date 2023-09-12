package Homework_3;

public abstract class Employee implements Comparable<Employee>{

    protected String name;
    protected String surName;
    protected double salary;
    protected int age;

    public abstract double calculateSalary();



    public Employee(String name, String surName, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s", surName, name);
    }

    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }

    public int getAge() {
        return age;
    }
}

