package LAB5;

import java.util.Scanner;

public class Student {
    String name;
    String city;
    int age;
    Scanner sc;

    void getData() {
        sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("City: ");
        city = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
    }

    void printData() {
        System.out.println("Student name: " + name);
        System.out.println("Student city: " + city);
        System.out.println("Student age: " + age);

    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("\nStudent " + (i + 1));
            Student std = new Student();
            std.getData();
            students[i] = std;
        }
        i = 1;
        for (Student student : students) {
            System.out.println("\nStudent " + i + " details");
            student.printData();
            i++;
        }
    }
}
