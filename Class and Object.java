class Person {
    // Instance variables
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's details
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonExample {
    public static void main(String[] args) {
        // Create an object of the Person class
        Person person1 = new Person("Ankit", 25);

        // Call the method to display details
        person1.displayInfo();
    }
}
