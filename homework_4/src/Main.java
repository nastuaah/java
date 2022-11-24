import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество точек: ");
        int n = scanner.nextInt();
        System.out.print("Радиус окружности: ");
        int radius = scanner.nextInt();
        int count = 0;
        for (int numberOfPoints = 1; numberOfPoints <= n; numberOfPoints++) {
            if (inCircle(scanner, radius, numberOfPoints))
                count++;
        }
        System.out.println(count + " точек попали в окружность");
        scanner.close();
    }

    private static boolean inCircle(Scanner scanner, int radius, int numberOfPoints) {
        System.out.printf("X %d точки: ", numberOfPoints);
        double x = scanner.nextDouble();
        System.out.printf("Y %d точки: ", numberOfPoints);
        double y = scanner.nextDouble();
        double distance = Math.sqrt(x * x + y * y);
        if (distance <= radius) return true;
        else return false;
    }
}
