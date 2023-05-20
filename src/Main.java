public class Main {
    public static void main(String[] args) {
        // задание 1
        System.out.println("задание 1");
        int deposit = 15_000;
        int total = 0;
        int month = 1;
        while (total <= 2_459_000) {
            total = total + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
            month = month + 1;
        }
        // задание 2
        System.out.println("задание 2");
        int start1 = 1;
        while (start1 <= 10) {
            System.out.print(start1 + " ");
            start1 = start1 + 1;
        }
        System.out.println();
        for (int start2 = 10; start2 > 0; start2 = start2 - 1) {
            System.out.print(start2 + " ");
        }
        // задание 3
        System.out.println("задание 3");
        int population = 12_000_000;
        int birthRate = 12_000 * 17;
        int mortalityRate = 12_000 / 8;
        for (int year = 2023; year <= 2033; year++) {
            population = population + birthRate - mortalityRate;
            System.out.println("Год " + year + " , численность населения страны Y составляет  " + population);
        }
        // задание 4
        System.out.println("задание 4");
        int depositVasil = 15000;
        for (int i = 1; depositVasil <= 12_000_000; i++) {
            depositVasil = depositVasil + ((depositVasil / 100) * 7);
            System.out.println("Месяц " + i + " сумма накоплений " + depositVasil);
        }
        // задание 5
        System.out.println("задание 5");
        depositVasil = 15000;
        for (int i = 1; depositVasil <= 12_000_000; i++) {
            depositVasil = depositVasil + ((depositVasil / 100) * 7);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений " + depositVasil);
            }
        }
        // задание 6
        System.out.println("задание 6");
        depositVasil = 15000;
        for (int i = 1; i <= (12 * 9); i++) {
            depositVasil = depositVasil + ((depositVasil / 100) * 7);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений " + depositVasil);
            }
        }
        // задание 7
        System.out.println("задание 7");
        int firstFridayDay = 3;
        if (firstFridayDay >= 1 && firstFridayDay <= 7) {
            int fridayDay = firstFridayDay;
            int day = 1;
            for (; day <= 31; day++) {
                if (day % fridayDay == 0) {
                    System.out.println("Сегодня пятница," + day + "-е число. Необходимо подготовить отчет");
                    fridayDay = fridayDay + 7;
                }
            }
        } else {
            System.out.println("Не коректно введеное число первой пятницы!!!!");
        }
        // задание 8
        System.out.println("задание 8");
        int commetVisiting = 79;
        for (int a = 1; commetVisiting <= 2023; a++) {
            commetVisiting = commetVisiting + 79;
            if ( commetVisiting >= 1823 && commetVisiting <= 2123){
                System.out.println(commetVisiting);
            }
        }
    }
}
