import java.util.Scanner;

public class AgeInSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age in years: ");
        int ageYears = scanner.nextInt();

        long secondsLived = (long) ageYears * 365 * 24 * 60 * 60;

        System.out.println("You've lived approximately " + secondsLived + " seconds!");

        scanner.close();
    }
}
