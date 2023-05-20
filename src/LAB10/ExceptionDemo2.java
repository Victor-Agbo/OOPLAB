package LAB10;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        for (int i = -5; i < 5; i++) {
            try {
                System.out.println(60 / i);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        }
    }
}
