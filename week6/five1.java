class Parent {
    public int show() {
        return 10;
    }
}

class Child extends Parent {
   
    @Override
    public String show() {
        return "Hello";
    }
}

public class five1 {
    public static void main(String[] args) {
        Parent obj = new Child();
        System.out.println(obj.show());
    }
}
