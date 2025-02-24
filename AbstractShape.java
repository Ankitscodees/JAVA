abstract class Shape {
    abstract void draw();

    void displayInfo() {
        System.out.println("🎨 This is a shape drawing system.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("🔵 Drawing a Circle...");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("⬛ Drawing a Rectangle...");
    }
}

public class AbstractShape {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.displayInfo();
        shape1.draw();

        shape2.displayInfo();
        shape2.draw();
    }
}
