import java.util.Scanner;

public class BalancedNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an even-digit number: ");
        String number = scanner.nextLine();

        if (number.length() % 2 != 0) {
            System.out.println("Please enter a number with an even number of digits.");
        } else {
            int mid = number.length() / 2;
            int sum1 = 0, sum2 = 0;

            for (int i = 0; i < mid; i++) {
                sum1 += number.charAt(i) - '0';
            }
            for (int i = mid; i < number.length(); i++) {
                sum2 += number.charAt
