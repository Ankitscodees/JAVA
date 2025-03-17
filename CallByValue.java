public class CallByValue {
    public static void main(String[] args) {
        int a = 10;
        modifyValue(a);
        System.out.println("Value after method call: " + a);
    }

    public static void modifyValue(int num) {
        num = num + 5;
    }
}
