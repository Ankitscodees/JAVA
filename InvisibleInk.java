import java.util.Scanner;

public class InvisibleInk {
    public static String encode(String message) {
        StringBuilder encoded = new StringBuilder();
        for (char c : message.toCharArray()) {
            encoded.append((char) (c + 1000)); // Shift each character by 1000
        }
        return encoded.toString();
    }

    public static String decode(String hiddenMessage) {
        StringBuilder decoded = new StringBuilder();
        for (char c : hiddenMessage.toCharArray()) {
            decoded.append((char) (c - 1000)); // Shift back to original
        }
        return decoded.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a message to hide: ");
        String secretMessage = scanner.nextLine();
        
        String hidden = encode(secretMessage);
        System.out.println("🔏 Encoded (Invisible Text): " + hidden);
        
        System.out.print("Do you want to decode it? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("🔓 Decoded Message: " + decode(hidden));
        }
        
        scanner.close();
    }
}
