package LAB9;

import java.util.Scanner;

interface Polygon {
    public abstract void getVolume();
}

class Rectangle implements Polygon {
    int length;
    int breadth;
    int height;

    public void getVolume() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length: ");
        breadth = sc.nextInt();

        System.out.print("Breadth: ");
        length = sc.nextInt();

        System.out.print("Height: ");
        height = sc.nextInt();

        sc.close();
    }

    void calculateArea() {
        System.out.println("Volume: " + (length * breadth * height));
    }
}

public class CuboidDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getVolume();
    }
}
