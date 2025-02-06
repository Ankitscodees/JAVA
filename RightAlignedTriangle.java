import java.util.Scanner;

public class RightAlignedTriangle {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of rows
        System.out.print("Enter the number of rows for the right-aligned triangle pattern: ");
        int rows = scanner.nextInt();

        // Loop to print the right-aligned triangle
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        // Close the scanner
        scanner.close();
    }
}
