import java.util.Scanner;
import java.util.Random;

public class BrainAgeEstimator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your favorite number: ");
        int favNumber = scanner.nextInt();

        int brainAge = (favNumber * 7 + random.nextInt(20)) % 100;
        if (brainAge < 10) brainAge += 10;

        System.out.println("🧠 Your estimated brain age is: " + brainAge + " years");

        scanner.close();
    }
}
