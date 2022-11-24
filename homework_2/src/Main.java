import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner hw2 = new Scanner(System.in);
        System.out.print("День: ");
        int day = hw2.nextInt();
        System.out.print("Месяц: ");
        int month = hw2.nextInt();
        if (day < 0 || day > 31 || month < 0 || month > 12) {
            System.out.println("Error");
            return;
        }
        if (month == 12 || month == 1 || month == 2)
            System.out.println("Зима");
        if (month == 3 || month == 4 || month == 5)
            System.out.println("Весна");
        if (month == 6 || month == 7 || month == 8)
            System.out.println("Лето");
        if (month == 9 || month == 10 || month == 11)
            System.out.println("Осень");
        hw2.close();
    }
}
