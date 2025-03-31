import java.util.*;

public class WordScramble {
    public static String scrambleWord(String word) {
        List<Character> letters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            letters.add(c);
        }
        Collections.shuffle(letters);
        
        StringBuilder scrambled = new StringBuilder();
        for (char c : letters) {
            scrambled.append(c);
        }
        return scrambled.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to scramble: ");
        String word = scanner.nextLine();

        String scrambled = scrambleWord(word);
        System.out.println("🔀 Scrambled Word: " + scrambled);

        System.out.print("Guess the original word: ");
        String guess = scanner.nextLine();

        if (guess.equalsIgnoreCase(word)) {
            System.out.println("🎉 Correct! You guessed it.");
        } else {
            System.out.println("❌ Wrong! The correct word was: " + word);
        }

        scanner.close();
    }
}
