import java.util.Scanner;

public class MoodDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a sentence to detect your mood:");
        long start = System.currentTimeMillis();
        String input = scanner.nextLine();
        long end = System.currentTimeMillis();

        long duration = end - start;
        String mood;

        if (input.equals(input.toUpperCase())) {
            mood = "Angry or Excited!";
        } else if (duration < 3000) {
            mood = "Energetic or Happy!";
        } else if (input.contains("...")) {
            mood = "Confused or Thoughtful.";
        } else if (duration > 7000) {
            mood = "Calm or Sad.";
        } else {
            mood = "Neutral or Chill.";
        }

        System.out.println("🧠 Detected mood: " + mood);
        scanner.close();
    }
}
