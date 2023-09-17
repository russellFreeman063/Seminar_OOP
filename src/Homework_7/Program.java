package Homework_7;


import static Homework_7.RandomGenerate.generateCompany;
import static Homework_7.RandomGenerate.generateResume;

public class Program {

    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();

        Resume resume1 = generateResume();
        System.out.println(resume1);
        jobAgency.registerObserver((Observer) resume1);

        Resume resume2 = generateResume();
        System.out.println(resume2);
        jobAgency.registerObserver((Observer) resume2);

        Resume resume3 = generateResume();
        System.out.println(resume3);
        jobAgency.registerObserver((Observer) resume3);

        Resume resume4 = generateResume();
        System.out.println(resume4);
        jobAgency.registerObserver((Observer) resume4);

        Resume resume5 = generateResume();
        System.out.println(resume5);
        jobAgency.registerObserver((Observer) resume5);

        Resume resume6 = generateResume();
        System.out.println(resume6);
        jobAgency.registerObserver((Observer) resume6);

        System.out.println();

        for (int i = 0; i < 20; i++) {
            if (!resume1.isActive())
                jobAgency.removeObserver((Observer) resume1);
            if (!resume2.isActive())
                jobAgency.removeObserver((Observer) resume2);
            if (!resume3.isActive())
                jobAgency.removeObserver((Observer) resume3);
            if (!resume4.isActive())
                jobAgency.removeObserver((Observer) resume4);
            if (!resume5.isActive())
                jobAgency.removeObserver((Observer) resume5);
            if (!resume6.isActive())
                jobAgency.removeObserver((Observer) resume6);

            Company company = generateCompany(jobAgency);
            company.needEmployee();
        }
    }
}