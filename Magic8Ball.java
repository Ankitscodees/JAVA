import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        String[] responses = {
            "Yes, definitely!", "No, absolutely not.", "Ask again later.",
            "It is certain.", "Very doubtful.", "Signs point to yes.",
            "Better not tell you now.", "Outlook not so good.", "You may rely on it."
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("🔮 Ask a Yes/No question: ");
        scanner.nextLine(); // Capture the question

        String answer = responses[random.nextInt(responses.length)];
        System.out.println("🎱 Magic 8-Ball says: " + answer);

        scanner.close();
    }
}
