import java.util.Random;

public class EmojiMoodDetector {
    public static void main(String[] args) {
        String[][] moods = {
            {"😊", "😁", "😃", "😄", "😆"}, // Happy
            {"😢", "😭", "😞", "😔", "😟"}, // Sad
            {"😡", "😠", "🤬", "😤", "👿"}, // Angry
            {"😱", "😨", "😰", "😵", "😧"}, // Surprised
            {"😴", "🥱", "😪", "💤", "🤤"}  // Sleepy
        };

        String[] categories = {"Happy", "Sad", "Angry", "Surprised", "Sleepy"};
        Random random = new Random();

        int moodIndex = random.nextInt(moods.length);
        int emojiIndex = random.nextInt(moods[moodIndex].length);

        System.out.println("🧠 Your Random Mood: " + categories[moodIndex]);
        System.out.println("😀 Emoji: " + moods[moodIndex][emojiIndex]);
    }
}
