package LAB8;

abstract class Shape {
    protected int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int mx, int my) {
        this.x += mx;
        this.y += my;
        System.out.println("Shape moved!");
    }

    abstract void show();
}

class Circle extends Shape {
    int centre;
    int radius;

    public Circle(int centre, int radius, int x, int y) {
        super(x, y);
        this.centre = centre;
        this.radius = radius;
    }

    public void show() {
        System.out.println("Centre: " + centre);
        System.out.println("Radius: " + radius);
    }
}

class Line extends Shape {
    int point1;
    int point2;

    public Line(int point1, int point2, int x, int y) {
        super(x, y);
        this.point1 = point1;
        this.point2 = point2;
    }

    public void show() {
        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);
    }
}

class Rectangle extends Shape {
    int diag1;
    int diag2;

    public Rectangle(int diag1, int diag2, int x, int y) {
        super(x, y);
        this.diag1 = diag1;
        this.diag2 = diag2;
    }

    public void show() {
        System.out.println("Diagonal 1: " + diag1);
        System.out.println("Diagonal 2: " + diag2);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Line l1 = new Line(5, 6, 0, 0);
        Rectangle r1 = new Rectangle(5, 7, 0, 0);
        Circle c1 = new Circle(4, 5, 0, 0);

        l1.show();
        r1.show();
        c1.show();
    }
}