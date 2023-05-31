package LAB9;

import java.util.Scanner;

interface Polygon {
    public abstract void getArea();
}

class Rectangle implements Polygon {
    int length;
    int breadth;

    public void getArea() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length: ");
        breadth = sc.nextInt();

        System.out.print("Breadth: ");
        length = sc.nextInt();

        sc.close();
    }

    void calculateArea() {
        System.out.println("Area: " + (length * breadth));
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea();

        r1.calculateArea();
    }
}
