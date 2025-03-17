class Number {
    int value;
}

public class CallByReference {
    public static void main(String[] args) {
        Number obj = new Number();
        obj.value = 10;
        modifyObject(obj);
        System.out.println("Value after method call: " + obj.value);
    }

    public static void modifyObject(Number obj) {
        obj.value = obj.value + 5;
    }
}
