package LAB2;

import java.util.Scanner;

public class Proj2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Basic Salary: ");

        long basicSalary = sc.nextLong();
        long annualSalary = basicSalary*12;

        long grossSalary = (annualSalary * 37) / 20;
        System.out.println("\nGross Salary: " + grossSalary);

        double iTax = 0D;
        sc.close();

        if (grossSalary >= 300000 && grossSalary <= 500000) {
            iTax = 0.1 * annualSalary;
        } else if (grossSalary > 500000 && grossSalary <= 1000000) {
            iTax = 0.15 * annualSalary;
        } else if (grossSalary > 1000000) {
            iTax = 0.25 * annualSalary;
        }

        System.out.println("Income tax: "+iTax);
    }
}
