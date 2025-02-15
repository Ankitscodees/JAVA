import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number, sum = 0, digits = 0;

        // Count the number of digits
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        // Calculate the sum of the power of digits
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        // Check if it's an Armstrong number
        if (sum == originalNumber) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
