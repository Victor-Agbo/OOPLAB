package LAB1;

import java.util.Scanner;

public class Proj1e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What operation (x, /, mod): ");
        String op = sc.next();

        op = op.toLowerCase();

        if (op.startsWith("mod")) {
            System.out.print("Enter Number: ");
            int num = sc.nextInt();

            System.out.print("Enter mod: ");
            int mod = sc.nextInt();

            System.out.println("The " + num + " mod " + mod + " is " + num % mod);

        } else if (op.equals("*") || op == "x") {
            System.out.print("Enter Number: ");
            Double num = sc.nextDouble();

            System.out.print("Enter second Number: ");
            Double mod = sc.nextDouble();

            System.out.println("The product of " + num + " and " + mod + " is " + num * mod);
        }

        else if (op.equals("/")) {
            System.out.print("Enter Number: ");
            Double num = sc.nextDouble();

            System.out.print("Enter second Number: ");
            Double mod = sc.nextDouble();

            System.out.println("The quotient of " + num + " and " + mod + " is " + num / mod);
        }

        sc.close();
    }
}
