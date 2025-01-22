import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Check for valid input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci series up to " + n + " terms:");

            // Variables to hold the first two terms
            int first = 0, second = 1;

            // Print the first term
            System.out.print(first);

            // Print the series
            for (int i = 1; i < n; i++) {
                System.out.print(", " + second);
                int next = first + second; // Calculate the next term
                first = second;           // Update the first term
                second = next;            // Update the second term
            }
        }

        // Close the scanner
        scanner.close();
    }
}
