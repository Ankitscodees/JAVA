import java.util.Random;
import java.util.Scanner;

public class TruthOrDare {
    public static void main(String[] args) {
        String[] truths = {
            "What is your biggest fear?", 
            "Have you ever kept a big secret?", 
            "Who was your first crush?", 
            "What is the most embarrassing thing you've done?", 
            "What is one thing you’ve never told anyone?"
        };

        String[] dares = {
            "Sing a song loudly!", 
            "Do 10 push-ups right now!", 
            "Talk in a funny accent for 1 minute.", 
            "Send a funny selfie to a friend.", 
            "Dance without music for 30 seconds."
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Do you choose Truth or Dare? (T/D): ");
        String choice = scanner.nextLine().trim().toUpperCase();

        if (choice.equals("T")) {
            System.out.println("🗣 Truth: " + truths[random.nextInt(truths.length)]);
        } else if (choice.equals("D")) {
            System.out.println("💪 Dare: " + dares[random.nextInt(dares.length)]);
        } else {
            System.out.println("❌ Invalid choice! Please enter T or D.");
        }

        scanner.close();
    }
}
