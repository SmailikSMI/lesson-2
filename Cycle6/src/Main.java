import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int senum;
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            senum=num;
            for (;;){
                if (senum>num & senum%5==0){
                    break;
                }
                else {
                    int time=num+5-senum;
                    System.out.println("Результат через "+ time );
                }
                senum++;
            }
            System.out.println("Следующее число кратное число 5: "+senum);
        }
        else {
            System.out.println("Неккоректный ввод");
        }

    }
}