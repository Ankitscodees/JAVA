import java.util.Scanner;

public class WeatherMood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter today's weather (sunny, rainy, cloudy, snowy): ");
        String weather = scanner.nextLine().toLowerCase();

        switch (weather) {
            case "sunny":
                System.out.println("Go out and enjoy a walk!");
                break;
            case "rainy":
                System.out.println("Perfect day for reading a book indoors!");
                break;
            case "cloudy":
                System.out.println("Maybe visit a cafe and relax.");
                break;
            case "snowy":
                System.out.println("Time for a snowball fight!");
                break;
            default:
                System.out.println("Weather not recognized. Just enjoy your day!");
        }

        scanner.close();
    }
}
