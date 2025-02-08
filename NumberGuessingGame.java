import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;
        int maxAttempts = 7;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it. Good luck!");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == targetNumber) {
                System.out.println("🎉 Congratulations! You guessed the number in " + attempts + " attempts.");
                guessedCorrectly = true;
                break;
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            System.out.println("Attempts remaining: " + (maxAttempts - attempts));
        }

        if (!guessedCorrectly) {
            System.out.println("😞 You've used all attempts! The correct number was: " + targetNumber);
        }

        scanner.close();
    }
}
