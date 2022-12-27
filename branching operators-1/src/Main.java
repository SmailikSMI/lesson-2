import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер месяца:");

        int month = in.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Пора года: Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Пора года: Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Пора года: Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Пора года: Осень");
                break;
            default:
                System.out.println("Введено не верное значение");
        }
    }
}