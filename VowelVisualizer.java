import java.util.Scanner;

public class VowelVisualizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();

        int[] vowels = new int[5]; // a, e, i, o, u

        for (char ch : input.toCharArray()) {
            switch (ch) {
                case 'a': vowels[0]++; break;
                case 'e': vowels[1]++; break;
                case 'i': vowels[2]++; break;
                case 'o': vowels[3]++; break;
                case 'u': vowels[4]++; break;
            }
        }

        System.out.println("\nVowel Frequency:");
        System.out.println("A: " + "*".repeat(vowels[0]));
        System.out.println("E: " + "*".repeat(vowels[1]));
        System.out.println("I: " + "*".repeat(vowels[2]));
        System.out.println("O: " + "*".repeat(vowels[3]));
        System.out.println("U: " + "*".repeat(vowels[4]));

        scanner.close();
    }
}
