public class TryWithoutCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
