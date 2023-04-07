package LAB7;

public class Para {
    private int id;
    private String name;

    public Para(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printData() {
        System.out.println();
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Para obj1 = new Para(1, "Object 1");
        Para obj2 = new Para(2, "Object 2");
        
        obj1.printData();
        obj2.printData();
    }
}
