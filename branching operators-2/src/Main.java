import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер месяца:");

        int month = in.nextInt();

        if (month == 1 || month == 2 || month == 12) {

            System.out.println("Пора года: Зима");

        }
        else if (month == 3 || month == 4 || month == 5) {

            System.out.println("Пора года: Весна");
        }
        else if (month == 6 || month == 7 || month == 8) {

            System.out.println("Пора года: Лето");
        }
        else if (month == 9 || month == 10 || month == 11) {

            System.out.println("Пора года: Осень");
        }
        else {
            System.out.println("Неверное значение");

        }
    }
}