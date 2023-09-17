package Homework_7;

public class Company {

    private final String name;
    private final Publisher jobAgency;
    private final int maxSalary;
    private String vacancy;
    private int experience;

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public Company(String name, Publisher jobAgency, String vacancy, int experience, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
        this.vacancy = vacancy;
        this.experience = experience;
    }

    public void needEmployee(){
        jobAgency.sendOffer(name, vacancy, experience, maxSalary);
    }
}
