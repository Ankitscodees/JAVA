public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int num = 10 / 0;
            System.out.println("Try block executed.");
        } catch (ArithmeticException e) {
            System.out.println("Catch: Division by zero.");
        } finally {
            System.out.println("Finally: Always executes.");
        }

        System.out.println("Program continues...");
    }
}
