import java.util.Scanner;

public class CaesarCipher {
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) ((c - base + shift) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        System.out.print("Enter shift value: ");
        int shift = scanner.nextInt();

        String encrypted = encrypt(input, shift);
        System.out.println("Encrypted Text: " + encrypted);

        String decrypted = encrypt(encrypted, 26 - (shift % 26));
        System.out.println("Decrypted Text: " + decrypted);

        scanner.close();
    }
}
