package LAB8;

class Vehicle {
    void drive() {
        System.out.println("Driving the vehicle!");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Driving the car!");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.drive();

        Car c1 = new Car();
        c1.drive();
    }
}
