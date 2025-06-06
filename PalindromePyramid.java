import java.util.Scanner;

public class PalindromePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Ascending part
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Descending part
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
