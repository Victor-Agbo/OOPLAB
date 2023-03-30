package LAB4;

import java.util.Scanner;

public class Employee {
    String empName;
    int empCode;
    int empSal;
    Scanner sc;

    void getData() {
        sc = new Scanner(System.in);
        System.out.print("Name: ");
        empName = sc.nextLine();
        System.out.print("City: ");
        empCode = sc.nextInt();
        System.out.print("Age: ");
        empSal = sc.nextInt();
    }

    void printData() {
        System.out.println("Employee name: " + empName);
        System.out.println("Employee code: " + empCode);
        System.out.println("Employee salary: " + empSal + " rupees");

    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.empName = "Victor";
        e1.empCode = 2048;
        e1.empSal = 10000;

        System.out.println("Employee 1");
        e1.printData();
        System.out.println();

        Employee e2 = new Employee();
        e2.empName = "Emmanuel";
        e2.empCode = 1024;
        e2.empSal = 15000;

        System.out.println("Employee 2");
        e2.printData();
        System.out.println();
    }
}
