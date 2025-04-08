import java.util.Random;

public class RandomSongLyric {
    public static void main(String[] args) {
        String[] subjects = {"I", "You", "We", "They", "She", "He"};
        String[] actions = {"dance in the rain", "cry like a wolf", "sing to the stars", "fly with dreams", "laugh at the moon", "run through fire"};
        String[] endings = {"every single day", "like no one's watching", "till the end of time", "with all our might", "under neon skies", "forever and always"};

        Random rand = new Random();

        String lyric = subjects[rand.nextInt(subjects.length)] + " " +
                       actions[rand.nextInt(actions.length)] + " " +
                       endings[rand.nextInt(endings.length)] + ".";

        System.out.println("🎤 Your random song lyric:");
        System.out.println(lyric);
    }
}
