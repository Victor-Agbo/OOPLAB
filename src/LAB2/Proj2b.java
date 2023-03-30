package LAB2;

import java.util.Scanner;

public class Proj2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count=0;

        System.out.print("Range (space seperated, e.g. 3 11): ");
        int left = sc.nextInt();
        int right = sc.nextInt();

        while (left <= right) {
            if (!(left % 2 == 0)) {
                sum += left;
                count++;
            }
            System.out.println(left);
            left++;
        }

        System.out.println("The sum of valid numbers is " + sum);
        System.out.println("The average is " + sum / count);

        sc.close();

    }
}
