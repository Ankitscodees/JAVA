class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonExample {
    public static void main(String[] args) {
        Person person1 = new Person("Ankit", 25);

        person1.displayInfo();
    }
}
