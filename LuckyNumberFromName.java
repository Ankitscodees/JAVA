import java.util.Scanner;

public class LuckyNumberFromName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().toUpperCase();

        int sum = 0;
        for (char ch : name.toCharArray()) {
            if (Character.isLetter(ch)) {
                sum += ch - 'A' + 1;
            }
        }

        while (sum > 9) {
            int temp = 0;
            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }

        System.out.println("Your lucky number is: " + sum);
        scanner.close();
    }
}
