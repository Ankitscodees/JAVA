public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: Division by zero is not allowed.");
        }
        System.out.println("Program continues...");
    }
}
