class Test {
    public static void display() {
        System.out.println("display()");
    }

    public static void display(int x) {
        System.out.println("display(int): " + x);
    }

    public static void display(String msg) {
        System.out.println("display(String): " + msg);
    }

    public static void display(int x, int y) {
        System.out.println("display(int, int): " + (x + y));
    }
}

public class five7 {
    public static void main(String[] args) {
        Test.display();
        Test.display(10);
        Test.display("Hello");
        Test.display(5, 15);
    }
}
