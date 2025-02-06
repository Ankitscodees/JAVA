import java.util.Scanner;

public class HollowPyramid {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of rows
        System.out.print("Enter the number of rows for the hollow pyramid pattern: ");
        int rows = scanner.nextInt();

        // Loop to print the hollow pyramid
        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int k = 1; k <= (2 * i - 1); k++) {
                // Print '*' for first and last column in each row, otherwise print space
                if (k == 1 || k == (2 * i - 1) || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
        }

        // Close the scanner
        scanner.close();
    }
}
