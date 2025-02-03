import java.util.Scanner;

public class InvertedTrianglePattern {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);


      System.out.print("Enter the number of rows for the inverted triangle pattern: ");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1; i--) {  
            for (int j = 1; j <= i; j++) { 
                System.out.print("*");
            }
            System.out.println(); 
        }

       
        scanner.close();
    }
}
