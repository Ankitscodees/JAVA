class Animal {
    // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the method in the subclass
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the method in the subclass
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal; // Reference of superclass

        myAnimal = new Dog();
        myAnimal.makeSound(); // Calls Dog's version

        myAnimal = new Cat();
        myAnimal.makeSound(); // Calls Cat's version
    }
}
