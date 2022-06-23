import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость билета");
        int cost = scanner.nextInt();
        int mile = cost / 20;
        System.out.println("Вы получите " + mile + " миль за купленный билет");
    }
}