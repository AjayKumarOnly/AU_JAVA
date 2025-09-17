import java.io.*;
class Parent {
    public void show() throws IOException {
        System.out.println("Parent: show() method");
        throw new IOException("Parent throwing IOException (checked)");
    }
}
class Child extends Parent {
    @Override
    public void show() throws RuntimeException {
        System.out.println("Child: show() method");
        throw new RuntimeException("Child throwing RuntimeException (unchecked)");
    }
}
public class ExceptionOverridingDemo {
    public static void main(String[] args) {
        System.out.println("Name : Ajay Kumar S");
        System.out.println("Roll No : 2024503701");
        Parent obj = new Child();
        try {
            obj.show();
        }
        catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }
}
