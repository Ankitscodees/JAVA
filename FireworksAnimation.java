import java.util.Random;
import java.util.concurrent.TimeUnit;

public class FireworksAnimation {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        String[] fireworks = {"✨", "💥", "🎆", "🔥", "🎇"};

        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(fireworks.length);
            System.out.println(fireworks[index] + " BOOM! ");
            TimeUnit.MILLISECONDS.sleep(500); // Small delay for effect
        }

        System.out.println("🎉 Happy Celebrations! 🎉");
    }
}
