package LAB1;

import java.util.Scanner;

public class Proj2e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What operation (+,-): ");
        String op = sc.next();

        op = op.toLowerCase();

        if (op.equals("+")) {
            System.out.print("Enter Number: ");
            Double num = sc.nextDouble();

            System.out.print("Enter second Number: ");
            Double num2 = sc.nextDouble();

            System.out.println("The sum of " + num + " and " + num2 + " is " + (num + num2));
        }

        else if (op.equals("-")) {
            System.out.print("Enter Number: ");
            Double num = sc.nextDouble();

            System.out.print("Enter second Number: ");
            Double num2 = sc.nextDouble();

            System.out.println("The difference between " + num + " and " + num2 + " is " + (num - num2));
        }

        sc.close();
    }
}
