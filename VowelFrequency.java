import java.util.Scanner;

public class VowelFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (char ch : sentence.toCharArray()) {
            switch (ch) {
                case 'a' -> a++;
                case 'e' -> e++;
                case 'i' -> i++;
                case 'o' -> o++;
                case 'u' -> u++;
            }
        }

        System.out.println("Vowel frequencies:");
        System.out.println("A: " + a);
        System.out.println("E: " + e);
        System.out.println("I: " + i);
        System.out.println("O: " + o);
        System.out.println("U: " + u);

        scanner.close();
    }
}
