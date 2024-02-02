import java.util.Scanner;

public class EX7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();
        convertDays(days);
    }

    public static String convertDays(int days) {
        int years = days / 365;
        int remainingDays = days % 365;
        int months = remainingDays / 30;
        remainingDays = remainingDays % 30;

	System.out.print(days + " days is approximately " + years + " years, " + months + " months, and " + remainingDays + " days.");
        return days + " days is approximately " + years + " years, " + months + " months, and " + remainingDays + " days.";
	
    }
}