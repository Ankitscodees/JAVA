import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Random random = new Random();
        int dice = random.nextInt(6) + 1; 
        System.out.println("You rolled a: " + dice);
    }
}
