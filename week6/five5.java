class Parent {
    
    public Object getValue() {
        return "Parent Object";
    }
}

class Child extends Parent {
    
    @Override
    public String getValue() {
        return "Child String";
    }
}

public class five5 {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.getValue()); // Parent Object

        Parent c = new Child();
        System.out.println(c.getValue()); // Child String
    }
}
