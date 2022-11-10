public class Main {
    public static void main(String[] args) {

        // Задание №1
        System.out.println("Задание №1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Задание №2
        System.out.println("\nЗадание №2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // Задание №3
        System.out.println("\nЗадание №3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        // Задание №4
        System.out.println("\nЗадание №4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Задание №5
        System.out.println("\nЗадание №5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        // Задание №6
        System.out.println("\nЗадание №6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // Задание №7
        System.out.println("\nЗадание №7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // Задание №8
        System.out.println("\nЗадание №8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }

        // Задание №9
        System.out.println("\nЗадание №9");
        int salary1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + total1/100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1);
        }
    }
}