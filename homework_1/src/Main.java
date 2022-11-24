import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner hw1 = new Scanner(System.in);
        System.out.print("День рождения: ");
        int day = hw1.nextInt();
        System.out.print("Месяц рождения: ");
        int month = hw1.nextInt();
        System.out.print("Год рождения: ");
        int year = hw1.nextInt();
        if (day < 0 || day > 31 || month < 0 || month > 12 || year < 0 || year > 2022) {
            System.out.println("Error");
            return;
        }
        int currentDay = 17, currentMonth = 11, currentYear = 2022;
        int diffYears = currentYear - year;
        if (currentMonth < month)
            diffYears--;
        int diffMonths = currentMonth - month;
        if (diffMonths < 0)
            diffMonths += 12;
        int diffDays = currentDay - day;
        if (diffDays < 0)
        {
            diffMonths--;
            if (diffMonths < 0)
            {
                diffYears--;
                diffMonths += 12;
            }
            diffDays += 31;
        }
        hw1.close();
        System.out.printf("%d лет, %d месяцев и %d дней", diffYears, diffMonths, diffDays);
    }
}