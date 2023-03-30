package LAB2;
import java.util.Scanner;

public class Proj1b {
    public static void main(String[] args) {
        Double sum = 0D;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Number: ");
            int num = sc.nextInt();

            if (num == 999) {
                break;
            }

            if (!(num % 5 == 0)) {
                sum += num;
                count++;
            }
        }

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + (sum / count));

        sc.close();
    }
}
