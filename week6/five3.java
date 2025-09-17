class Parent {
    public void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    
    @Override
    public void show(int x) {
        System.out.println("Child show(int): " + x);
    }
}

public class five3 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();    
    }
}
