import java.util.Scanner;

public class NumberToEmoji {
    public static void main(String[] args) {
        String[] emojiDigits = {"0️⃣", "1️⃣", "2️⃣", "3️⃣", "4️⃣", "5️⃣", "6️⃣", "7️⃣", "8️⃣", "9️⃣"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        StringBuilder emojiNumber = new StringBuilder();
        for (char c : number.toCharArray()) {
            if (Character.isDigit(c)) {
                emojiNumber.append(emojiDigits[c - '0']);
            } else {
                emojiNumber.append(c); // Keep non-digit characters as-is
            }
        }

        System.out.println("Emoji version: " + emojiNumber);
        scanner.close();
    }
}
