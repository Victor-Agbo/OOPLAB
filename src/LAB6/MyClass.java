package LAB6;

public class MyClass {
    private int count;

    public MyClass(int count) {
        this.count = count;
    }

    protected void finalize() throws Throwable {
        try {
            System.out.println("Count: " + --count);
        } catch (Throwable e) {
            throw e;
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) throws Throwable {
        MyClass my1 = new MyClass(10);
        MyClass my2 = new MyClass(15);

        my1.finalize();
        my2.finalize();
    }
}

// Write a java program that creates a class called ‘Myclass’ with private
// instance variable ‘count’. ‘Myclass’ should have a constructor that takes an
// integer value and sets ‘count’ to that value. ‘Myclass’ should also have a
// ‘finalize()’ method that decrements count by 1 and prints the value of
// ‘count’ to the console. In the main() method of the program , create two
// instances of the ‘Myclass’ with different integer values.