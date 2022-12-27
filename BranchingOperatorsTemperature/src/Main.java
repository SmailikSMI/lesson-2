import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение температуры:");
        int temp = in.nextInt();
        if (temp> -5){
            System.out.println("Тепло");
        }
        else if (temp <= -5 && temp > -20){
            System.out.println("Нормально");
        }
        else if (temp<= -20){
            System.out.println("Холодно");
        }
        else System.out.println("Введено неверное значение");
    }
}