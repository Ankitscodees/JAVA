import java.util.Random;
import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int luckyNumber = name.chars().sum() % 100 + random.nextInt(10); // Unique number calculation
        System.out.println("🍀 Your lucky number is: " + luckyNumber);

        scanner.close();
    }
}
