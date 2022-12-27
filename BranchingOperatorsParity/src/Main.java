import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = in.nextInt();

        if(num %2 == 0) {
            System.out.println("Число четное");
        }
        else {
            System.out.println("Число нечетное");
        }
    }
}
