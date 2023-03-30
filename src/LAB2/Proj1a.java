package LAB2;

import java.util.Scanner;

public class Proj1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double total = 0D;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            Double num = sc.nextDouble();
            total += num;

        }

        System.out.println();
        System.out.println("Your total is " + total);
        System.out.println("Your average mark is " + total / 5);
        System.out.println("Percentage is " + total / 5 + "%");

        sc.close();
    }
}
