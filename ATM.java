import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int balance = 5000; // Initial account balance
        
        // User inputs withdrawal amount
        System.out.print("Enter withdrawal amount: ");
        int amount = scanner.nextInt();

        // Check conditions for withdrawal
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else if (amount % 100 != 0) {
            System.out.println("Please enter an amount in multiples of 100.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: " + balance);
        }

        scanner.close();
    }
}
