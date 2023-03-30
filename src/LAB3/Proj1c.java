package LAB3;

import java.util.Scanner;

public class Proj1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("str1: ");
        String str1 = sc.nextLine();
        System.out.print("str2: ");
        String str2 = sc.nextLine();
        sc.close();

        System.out.println("str1 length: " + str1.length());
        System.out.println("str2 length: " + str2.length());
        System.out.println("str1 + str2: " + str1.concat(str2));

        System.out.println("Comparison: " + (str1.compareTo(str2) == 0 ? "Same" : "Not Same"));
        System.out.println("1st half of str1: " + str1.substring(0, str1.length() / 2 + 1));
        System.out.println("2nd half of str2: " + str2.substring(str2.length() / 2));
        System.out.println("Replaced: " + str1.replace('i', 'a'));
    }
}