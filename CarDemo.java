// Define a class
class Car {
    // Properties (attributes)
    String brand;
    int year;

    // Method (behavior)
    void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Manufacturing Year: " + year);
    }
}

// Main class to create objects
public class CarDemo {
    public static void main(String[] args) {
        // Creating an object of Car class
        Car myCar = new Car();

        // Assigning values to the object's properties
        myCar.brand = "Tesla";
        myCar.year = 2023;

        // Calling the method to display car details
        myCar.displayInfo();
    }
}
