package Homework_7;

import java.util.Random;

public class RandomGenerate {

    private static final Random random = new Random();
    public static Resume generateResume() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь",
                "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surNames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов",
                "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        int salary = random.nextInt(300, 800);
        int age = random.nextInt(30, 50);
        String[] vacancy = new String[]{"IT", "Маркетинг", "Водитель"};
        int exp = random.nextInt(2, age - 20);

        if (random.nextInt(3) == 1)
            return new Master(names[random.nextInt(names.length)],
                    surNames[random.nextInt(surNames.length)], age,
                    vacancy[random.nextInt(vacancy.length)], exp, salary * 100);
        if (random.nextInt(3) == 2)
            return new Freelancer(names[random.nextInt(names.length)],
                    surNames[random.nextInt(surNames.length)], age,
                    vacancy[random.nextInt(vacancy.length)], exp, salary * 20);
        else
            return new Student(names[random.nextInt(names.length)],
                    surNames[random.nextInt(surNames.length)], age / 2,
                    vacancy[random.nextInt(vacancy.length)], 1, salary * 10);
    }

    public static Company generateCompany(Publisher jobAgency) {
        String[] names = new String[]{"Google", "Yandex", "Amazon", "Apple", "GeekBrains"};
        String[] vacancy = new String[]{"IT", "Маркетинг", "Водитель"};
        int experience = random.nextInt(4);
        int salary = random.nextInt(500, 1000);

        return new Company(names[random.nextInt(names.length)], jobAgency,
                vacancy[random.nextInt(vacancy.length)], experience,
               salary * 100);
    }
}
