package LAB3;

import java.util.Scanner;

public class Proj2c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String str = sc.nextLine();
        sc.close();
        int len = str.length();

        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("It's a palindrome");
    }
}
// c. Write a java program to check whether input string is palindrome or not.