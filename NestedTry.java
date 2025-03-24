public class NestedTry {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block started.");

            try {
                int num = 10 / 0;
                System.out.println("Inner try block executed.");
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero.");
            }

            int arr[] = {1, 2, 3};
            System.out.println(arr[5]); // This will cause an exception

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index out of bounds.");
        }

        System.out.println("Program continues...");
    }
}
