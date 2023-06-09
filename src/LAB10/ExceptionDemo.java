package LAB10;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            int[] nums = new int[-1];
            System.out.println(nums);
        } catch (NegativeArraySizeException e) {
            System.out.println("Exception: " + e);
        }

        String ptr = null;
        try {
            if (ptr.equals("string"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
        }
        
        int[] nums = new int[2];
        try {
            int a = nums[2];
            System.out.println(a);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
    }
}
