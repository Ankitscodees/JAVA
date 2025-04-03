import java.util.Scanner;

public class BirthdateFortune {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birthdate (DDMMYYYY): ");
        String birthdate = scanner.nextLine();

        int fortuneNumber = 0;
        for (char digit : birthdate.toCharArray()) {
            fortuneNumber += Character.getNumericValue(digit);
        }

        // Reduce to a single-digit fortune number
        while (fortuneNumber > 9) {
            int sum = 0;
            while (fortuneNumber > 0) {
                sum += fortuneNumber % 10;
                fortuneNumber /= 10;
            }
            fortuneNumber = sum;
        }

        System.out.println("🔮 Your fortune number is: " + fortuneNumber);
        scanner.close();
    }
}
