package LAB5;

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
    }

    void printData() {
        System.out.println("Employee name: " + empName);
        System.out.println("Employee code: " + empCode);
        System.out.println("Employee salary: " + empSal + " rupees");

    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("\nEmployee " + (i + 1));
            Employee emp = new Employee();
            emp.getData();
            employees[i] = emp;
        }

        for (Employee emp : employees) {
            if (emp.empSal > 25000) {
                System.out.println("\nEmployee with salary > 25000");
                emp.printData();
            }
        }
    }
}
