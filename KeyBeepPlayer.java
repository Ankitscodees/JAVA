import java.util.Scanner;

public class KeyBeepPlayer {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type any letter (a, b, c...) to hear a beep. Type 'exit' to stop.");

        while (true) {
            System.out.print("Key: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("exit")) break;

            if (input.length() == 1 && input.matches("[a-z]")) {
                int frequency = 440 + (input.charAt(0) - 'a') * 20; // Increasing pitch
                java.awt.Toolkit.getDefaultToolkit().beep(); // Basic beep
                System.out.println("Beep! (Pretend it's tuned to: " + frequency + "Hz)");
                Thread.sleep(300);
            } else {
                System.out.println("Invalid input.");
            }
        }

        scanner.close();
    }
}
