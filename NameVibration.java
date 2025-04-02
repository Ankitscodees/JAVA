import java.util.Scanner;

public class NameVibration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().toUpperCase();

        int vibrationScore = 0;
        for (char c : name.toCharArray()) {
            if (Character.isLetter(c)) {
                vibrationScore += (c - 'A' + 1); // A=1, B=2, ..., Z=26
            }
        }

        System.out.println("🔮 Your name's vibration score is: " + vibrationScore);
        scanner.close();
    }
}
