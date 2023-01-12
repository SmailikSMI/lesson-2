import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите длинну массива:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double nums [];
        nums= new double [num];
        nums[num]=Math.random();


        System.out.println("Случайный массив: "+ nums);
    }
}