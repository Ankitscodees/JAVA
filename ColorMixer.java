import java.util.Scanner;

public class ColorMixer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first color (red, blue, yellow): ");
        String color1 = scanner.nextLine().toLowerCase();

        System.out.print("Enter second color (red, blue, yellow): ");
        String color2 = scanner.nextLine().toLowerCase();

        String result = "";

        if (color1.equals(color2)) {
            result = color1;
        } else if ((color1.equals("red") && color2.equals("blue")) || 
                   (color1.equals("blue") && color2.equals("red"))) {
            result = "purple";
        } else if ((color1.equals("red") && color2.equals("yellow")) ||
                   (color1.equals("yellow") && color2.equals("red"))) {
            result = "orange";
        } else if ((color1.equals("blue") && color2.equals("yellow")) ||
                   (color1.equals("yellow") && color2.equals("blue"))) {
            result = "green";
        } else {
            result = "Invalid color combination!";
        }

        System.out.println("Resulting color: " + result);
        scanner.close();
    }
}
