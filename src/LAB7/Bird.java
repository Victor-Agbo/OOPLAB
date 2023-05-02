package LAB7;

public class Bird {
    String name;

    public Bird(String name) {
        this.name = name;
        System.out.println();
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        Bird bird1 = new Bird("Jack");
        Bird bird2 = new Bird("Jill");

    }
}
