import java.util.Scanner;
import java.util.Random;

public class ReactionTimeTester {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Get ready... Wait for 'GO!' and press Enter as fast as you can!");
        Thread.sleep(2000 + random.nextInt(3000)); // Random wait between 2-5 seconds

        System.out.println("GO!");
        long startTime = System.currentTimeMillis();

        scanner.nextLine(); // Wait for user to press Enter

        long endTime = System.currentTimeMillis();
        long reactionTime = endTime - startTime;

        System.out.println("⚡ Your reaction time: " + reactionTime + " ms");

        scanner.close();
    }
}
