package LAB1;

public class Proj2d {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        System.out.println("Before swap a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap a = " + a + ", b = " + b);
    }
}
