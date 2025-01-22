import java.util.Scanner;

public class FibonacciRecursive {

    // Method to calculate Fibonacci using recursion
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: F(0) = 0, F(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci series up to " + n + " terms:");

            // Loop to print the Fibonacci series
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
