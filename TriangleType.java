import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three sides of the triangle
        System.out.print("Enter first side: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter second side: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter third side: ");
        int side3 = scanner.nextInt();

        // Check the type of triangle
        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is Equilateral.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The triangle is Isosceles.");
        } else {
            System.out.println("The triangle is Scalene.");
        }

        scanner.close();
    }
}
