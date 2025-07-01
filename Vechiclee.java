
class VechicleeBase {
    void startEngine() {
        System.out.println("Engine started");
    }

    void stopEngine() {
        System.out.println("Engine stopped");
    }
}

class Car extends VechicleeBase {
    void drive() {
        System.out.println("Driving the car");
    }
}

class Motorcycle extends VechicleeBase {
    void ride() {
        System.out.println("Riding the motorcycle");
    }
}

public class Vechiclee {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        myCar.drive();
        myCar.stopEngine();

        Motorcycle myBike = new Motorcycle();
        myBike.startEngine();
        myBike.ride();
        myBike.stopEngine();
    }
}
