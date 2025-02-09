import java.util.Scanner;

public class XShapePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the X pattern (odd number): ");
        int size = scanner.nextInt();
        if (size % 2 == 0) {
            System.out.println("Please enter an odd number for a perfect X shape.");
        } else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == j || j == size - i - 1) {
                        System.out.print("*"); // Print star at diagonal positions
                    } else {
                        System.out.print(" "); // Print spaces elsewhere
                    }
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
