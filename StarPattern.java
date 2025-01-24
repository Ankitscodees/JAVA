import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of rows
        System.out.print("Enter the number of rows for the star pattern: ");
        int rows = scanner.nextInt();

        // Loop to print the star pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        // Close the scanner
        scanner.close();
    }
}
