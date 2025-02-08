import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of rows
        System.out.print("Enter the number of rows for the butterfly pattern: ");
        int rows = scanner.nextInt();

        // Upper part of the butterfly
        for (int i = 1; i <= rows; i++) {
            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }
            // Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the butterfly
        for (int i = rows; i >= 1; i--) {
            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }
            // Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
