package LAB3;

import java.util.Scanner;

public class Proj2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Character: ");

        String ch = sc.next();
        ch = ch.toLowerCase();

        if (ch.length() != 1) {
            System.out.println("Input too long");
            sc.close();
            return;
        }
        sc.close();

        switch (ch) {
            case "a", "e", "i", "o", "u":
                System.out.println("Vowel");
                break;

            case "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y",
                    "z":
                System.out.println("Consonant");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

    }
}

// a. Write a java program that will print month name of the given number (Using
// Switch statement)
// Eg:- If we are inserting 1 then it should print January .
// b. Write a Java Program to multiply two matrices of 3X3.
// c. Write a java program to perform following string operations:
// String length, string concatenation, compare two string,
// substring, Replace string.