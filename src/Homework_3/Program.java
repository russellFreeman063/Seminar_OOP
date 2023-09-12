package Homework_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            employees.add(generateEmployee());
        }

        for (Object worker : employees) {
            System.out.println(worker);
        }
        System.out.println();

        employees.sort(new SalaryComparator());
        for (Employee worker : employees) {
            System.out.println(worker);
        }
        System.out.println();

        employees.sort(new AgeComparator());
        for (Employee worker : employees) {
            System.out.println(worker);
        }
    }

    private static final Random random = new Random();

    public static Employee generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь",
                "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surNames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов",
                "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        int salaryIndex = random.nextInt(200, 500);
        int age = random.nextInt(30, 50);

        if (random.nextBoolean()) {
            return new Freelancer(names[random.nextInt(names.length)],
                    surNames[random.nextInt(surNames.length)], 100 * salaryIndex, age);
        } else {
            return new Worker(names[random.nextInt(names.length)],
                    surNames[random.nextInt(surNames.length)], 100 * salaryIndex, age);
        }
    }
}
