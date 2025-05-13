import java.util.Scanner;

public class MirrorPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            for (int s = 0; s < i; s++)
                System.out.print(" ");
            for (int j = i; j < input.length(); j++)
                System.out.print(input.charAt(j) + " ");
            System.out.println();
        }

        scanner.close();
    }
}
