package LAB8;

abstract class Vehicle{
    String fuel = "Diesel";
    int seats = 4;

    abstract void hasGoodEngine();
}

class Car extends Vehicle{

    void hasGoodEngine(){
        System.out.println("Has good engine!");
    }
}

class Truck extends Vehicle{

    void hasGoodEngine(){
        System.out.println("Has bad engine!");
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        Car c1 = new Car();
        Truck t1 = new Truck();

        c1.hasGoodEngine();
        t1.hasGoodEngine();
    }
}
