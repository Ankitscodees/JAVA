class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.name = "Ankit";
        person1.age = 19;

        person1.introduce();
    }
}
