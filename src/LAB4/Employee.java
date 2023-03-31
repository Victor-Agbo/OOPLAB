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
        System.out.print("Employee code: ");
        empCode = sc.nextInt();
        System.out.print("Salary: ");
        empSal = sc.nextInt();
        System.out.println();
    }

    void printData() {
        System.out.println("Employee name: " + empName);
        System.out.println("Employee code: " + empCode);
        System.out.println("Employee salary: " + empSal + " rupees");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.getData();

        Employee e2 = new Employee();
        e2.getData();

        System.out.println("Employee 1");
        e1.printData();
        System.out.println();

        System.out.println("Employee 2");
        e2.printData();
        System.out.println();
    }
}
