class Parent {
    public void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    
    @Override
    private void display() {
        System.out.println("Child display");
    }
}

public class five2 {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}
