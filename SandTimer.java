public class SandTimer {
    public static void main(String[] args) throws InterruptedException {
        int height = 6;

        for (int i = 0; i <= height; i++) {
            // Top part (inverted triangle)
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int j = 0; j < 2 * (height - i) + 1; j++) System.out.print("*");
            System.out.println();
            Thread.sleep(300);
        }

        for (int i = 1; i <= height; i++) {
            // Bottom part (regular triangle)
            for (int j = 0; j < height - i; j++) System.out.print(" ");
            for (int j = 0; j < 2 * i - 1; j++) System.out.print("*");
            System.out.println();
            Thread.sleep(300);
        }
    }
}
