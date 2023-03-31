package LAB4;

public class Student {
    String name;
    String city;
    int age;

    void printData() {
        System.out.println("Student name: " + name);
        System.out.println("Student city: " + city);
        System.out.println("Student age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Victor";
        s1.city = "Lagos";
        s1.age = 19;

        System.out.println("Student 1");
        s1.printData();
        System.out.println();

        Student s2 = new Student();
        s2.name = "Emmanuel";
        s2.city = "Abuja";
        s2.age = 17;

        System.out.println("Student 2");
        s2.printData();
        System.out.println();
    }
}
