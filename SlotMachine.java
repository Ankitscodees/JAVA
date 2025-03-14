import java.util.Random;

public class SlotMachine {
    public static void main(String[] args) {
        String[] symbols = {"🍒", "🔔", "🍋", "⭐", "💎", "7️⃣"};
        Random random = new Random();

        String slot1 = symbols[random.nextInt(symbols.length)];
        String slot2 = symbols[random.nextInt(symbols.length)];
        String slot3 = symbols[random.nextInt(symbols.length)];

        System.out.println("🎰 Slot Machine 🎰");
        System.out.println("-----------------");
        System.out.println("| " + slot1 + " | " + slot2 + " | " + slot3 + " |");
        System.out.println("-----------------");

        if (slot1.equals(slot2) && slot2.equals(slot3)) {
            System.out.println("🎉 JACKPOT! You won! 🎉");
        } else {
            System.out.println("😢 Try again!");
        }
    }
}
