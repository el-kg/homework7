public class Main {
    public static void main(String[] args) {
        // задание 1
        System.out.println("задание 1");
        int deposit = 15_000;
        int total = 0;
        int month = 1;
        int expectedAmount = 2_459_000;
        while (total <= expectedAmount) {
            total = total + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
            month++;
        }
        // задание 2
        System.out.println("задание 2");
        int start1 = 1;
        while (start1 <= 10) {
            System.out.print(start1 + " ");
            start1++;
        }
        System.out.println();
        for (int start2 = 10; start2 > 0; start2 = start2 - 1) {
            System.out.print(start2 + " ");
        }
        // задание 3
        System.out.println("задание 3");
        int population = 12_000_000;
        int birthRate;
        int mortalityRate;
        for (int year = 2023; year <= 2033; year++) {
            birthRate = (population / 1000) * 17;
            mortalityRate = (population / 1000) * 8;
            population = population + birthRate - mortalityRate;
            System.out.println("Год " + year + " , численность населения страны Y составляет  " + population);
        }
        // задание 4
        System.out.println("задание 4");
        int depositVasil1 = 15000;
        for (int i = 1; depositVasil1 <= 12_000_000; i++) {
            depositVasil1 = depositVasil1 + ((depositVasil1 / 100) * 7);
            System.out.println("Месяц " + i + " сумма накоплений " + depositVasil1);
        }
        // задание 5
        System.out.println("задание 5");
        int depositVasil2 = 15000;
        for (int i = 1; depositVasil2 <= 12_000_000; i++) {
            depositVasil2 = depositVasil2 + ((depositVasil2 / 100) * 7);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений " + depositVasil2);
            }
        }
        // задание 6
        System.out.println("задание 6");
        int depositVasil3 = 15000;
        for (int i = 1; i <= (12 * 9); i++) {
            depositVasil3 = depositVasil3 + ((depositVasil3 / 100) * 7);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений " + depositVasil3);
            }
        }
        // задание 7
        System.out.println("задание 7");
        int firstFridayDay = 3;
        if (firstFridayDay >= 1 && firstFridayDay <= 7) {
            int fridayDay = firstFridayDay;
            for (; fridayDay <= 31; fridayDay += 7) {
                System.out.println("Сегодня пятница, " + fridayDay + "-е число. Необходимо подготовить отчет");
            }
        } else {
            System.out.println("Не коректно введеное число первой пятницы!!!!");
        }
        // Задание 8
        System.out.println("Задание 8");
        int commetVisiting = 79;
        for (; commetVisiting <= 2123; commetVisiting += 79) {
            if (commetVisiting >= 1823) {
                System.out.println(commetVisiting);
            }
        }
    }
}
