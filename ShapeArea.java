class Shape {
    double area(double side) {
        return side * side;
    }

    double area(double length, double width) {
        return length * width;
    }

    double area(int radius) {
        return Math.PI * radius * radius;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Shape shape = new Shape();

        System.out.println("Area of Square: " + shape.area(5));
        System.out.println("Area of Rectangle: " + shape.area(10, 6));
        System.out.println("Area of Circle: " + shape.area(7));
    }
}
