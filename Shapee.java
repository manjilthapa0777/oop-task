
class ShapeeBase {
    double calculateArea() {
        return 0.0; // Generic shape area
    }
}

class Rectangle extends ShapeeBase {
    int length; 
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

class Square extends Rectangle {
    Square(int side) {
        super(side, side);  // Square is rectangle with equal sides
    }
}

class Circle extends ShapeeBase {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Shapee {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        Square square = new Square(7);
        Circle circle = new Circle(4);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Circle Area: " + circle.calculateArea());
    }
}
