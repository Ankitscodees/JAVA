class Animal {
    void makeSound() {
        System.out.println("Animals make different sounds.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("🐶 Dog says: Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("🐱 Cat says: Meow Meow!");
    }
}

class Lion extends Animal {
    @Override
    void makeSound() {
        System.out.println("🦁 Lion says: Roarrr!");
    }
}


public class MethodOverride {
    public static void main(String[] args) {
        
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myLion = new Lion();

        
        myAnimal.makeSound(); 
        myDog.makeSound();   
        myCat.makeSound();   
        myLion.makeSound();   
    }
}
