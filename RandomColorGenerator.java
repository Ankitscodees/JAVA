import java.util.Random;

public class RandomColorGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        String hexColor = String.format("#%02X%02X%02X", red, green, blue);

        System.out.println("🎨 Generated Color:");
        System.out.println("RGB: (" + red + ", " + green + ", " + blue + ")");
        System.out.println("Hex: " + hexColor);
    }
}
