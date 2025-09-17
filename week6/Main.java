class Parent {
    public void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    public void display() {
        System.out.println("Child display()");
    }
}

class AnotherChild extends Parent {
    public void print() {
        System.out.println("AnotherChild print()");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p1 = new Child(); 
        p1.show();

        Child c1 = (Child) p1;
        c1.show();
        c1.display();

        try {
            Parent p2 = new Parent();
            Child c2 = (Child) p2;
            c2.display();
        } catch (ClassCastException e) {
            System.out.println("Wrong Downcasting: " + e);
        }

        Parent p3 = new AnotherChild();
        p3.show();

        try {
            Child c3 = (Child) p3;
            c3.display();
        } catch (ClassCastException e) {
            System.out.println("Wrong Downcasting (AnotherChild → Child): " + e);
        }
    }
}
