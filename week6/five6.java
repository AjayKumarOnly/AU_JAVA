class Parent {
    public void show() {
        System.out.println("Parent show()");
    }

    public void show(int x) {
        System.out.println("Parent show(int): " + x);
    }
}

class Child extends Parent {
    public void show(String msg) {
        System.out.println("Child show(String): " + msg);
    }

    public void show(int x, int y) {
        System.out.println("Child show(int, int): " + (x + y));
    }
}

public class five6 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();
        p.show(10);

        Child c = new Child();
        c.show();
        c.show(20);
        c.show("Hello");
        c.show(5, 15);
    }
}
