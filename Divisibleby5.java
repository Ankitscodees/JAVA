import java.util.Scanner;

public class Divisibleby5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        if (number % 2 == 0 && number % 5 == 0) {
            System.out.println(number + " is even and divisible by 5.");
        } else if (number % 2 == 0) {
            System.out.println(number + " is even but not divisible by 5.");
        } else if (number % 5 == 0) {
            System.out.println(number + " is odd and divisible by 5.");
        } else {
            System.out.println(number + " is odd and not divisible by 5.");
        }

        scanner.close();
    }
}
