package LAB6;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    protected void finalize() throws Throwable {
        try {
            System.out.println("Object has been destroyed!");
        } catch (Throwable e) {
            throw e;
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) throws Throwable {
        Person p1 = new Person("Victor", 19, "15, Sanni street");
        Person p2 = new Person("Emmanuel", 17, "Abuja");

        p1.finalize();
        p2.finalize();
    }
}