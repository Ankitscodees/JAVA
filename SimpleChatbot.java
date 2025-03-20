import java.util.HashMap;
import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        HashMap<String, String> responses = new HashMap<>();
        responses.put("hello", "Hi there! How can I assist you?");
        responses.put("how are you", "I'm just a program, but I'm doing great!");
        responses.put("what's your name", "I'm a simple chatbot created in Java.");
        responses.put("bye", "Goodbye! Have a great day!");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hello! Type something to chat (or type 'bye' to exit).");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();
            
            if (responses.containsKey(userInput)) {
                System.out.println("Chatbot: " + responses.get(userInput));
            } else {
                System.out.println("Chatbot: I'm not sure how to respond to that.");
            }

            if (userInput.equals("bye")) {
                break;
            }
        }

        scanner.close();
    }
}
