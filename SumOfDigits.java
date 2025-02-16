import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        // Calculate the sum of digits
        while (number != 0) {
            sum += number % 10; // Extract last digit and add to sum
            number /= 10; // Remove last digit
        }

        // Display the result
        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}
