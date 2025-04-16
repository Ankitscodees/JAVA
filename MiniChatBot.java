import java.util.Scanner;

public class MiniChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ChatBot: Hi! Ask me anything. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.contains("hello") || input.contains("hi")) {
                System.out.println("ChatBot: Hello there!");
            } else if (input.contains("how are you")) {
                System.out.println("ChatBot: I'm just code, but I'm good!");
            } else if (input.contains("your name")) {
                System.out.println("ChatBot: I'm a mini Java bot!");
            } else if (input.equals("bye")) {
                System.out.println("ChatBot: Goodbye! Have a great day.");
                break;
            } else {
                System.out.println("ChatBot: Hmm... I didn’t understand that.");
            }
        }

        scanner.close();
    }
}
