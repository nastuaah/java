import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner hw3 = new Scanner(System.in);
        System.out.print("x: ");
        int x = hw3.nextInt();
        System.out.print("n: ");
        int n = hw3.nextInt();
        boolean minus = n < 0;
        if (minus) n *= -1;
        double outcome = 1;
        int time = 1;
        while (time <= n) {
            outcome*= x;
            time++;
        }
        if (minus) outcome = 1 / outcome;
        hw3.close();
        System.out.println(outcome);
    }
}