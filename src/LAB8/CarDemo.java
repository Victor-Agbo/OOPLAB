package LAB8;

class Vehicle2 {
    void drive() {
        System.out.println("Driving the vehicle!");
    }
}

class Car extends Vehicle2 {
    void drive() {
        System.out.println("Driving the car!");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Vehicle2 v1 = new Vehicle2();
        v1.drive();

        Car c1 = new Car();
        c1.drive();
    }
}
