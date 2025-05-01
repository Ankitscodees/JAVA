import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = scanner.nextLine();

        if (num.length() <= 1) {
            System.out.println("Rotated number: " + num);
        } else {
            String rotated = num.substring(1) + num.charAt(0);
            System.out.println("Rotated number: " + rotated);
        }

        scanner.close();
    }
}
