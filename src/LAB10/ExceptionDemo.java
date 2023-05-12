package LAB10;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            int[] nums = new int[-1];
        } catch (NegativeArraySizeException e) {
            System.out.println("Exception: " + e);
        }

        int[] nums = new int[2];
        String ptr = null;
        try {
            if (ptr.equals("string"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
        }

        try {
            int a = nums[2];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: "+e);
        }
    }
}
