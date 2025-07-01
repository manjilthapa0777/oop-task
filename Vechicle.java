
class VehicleBase {
    void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends VehicleBase {
    void display() {
        System.out.println("This is a Car. Brand: Toyota, Model: Camry");
    }
}

public class Vechicle {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();     // Inherited method
        myCar.display();   // Car's own method
    }
}

