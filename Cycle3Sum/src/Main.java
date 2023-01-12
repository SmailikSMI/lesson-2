import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите целое и положительное число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum=0;
        for (int i =1; i<number & number>0;i++){
            sum=sum + i ;
        }
        System.out.println("Сумма всех числ от 1 до вашего: " +sum);
    }
}