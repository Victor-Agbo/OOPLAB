package LAB1;

public class Proj1d {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        System.out.println("Before swap a = " + a + ", b = " + b);

        int tmp = a;
        a = b;
        b = tmp;

        System.out.println("After swap a = " + a + ", b = " + b);
    }
}
