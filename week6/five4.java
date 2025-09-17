class Test {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(int a, int b) {
        return (double)(a + b);
    }
}

public class five4 {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.add(5, 10));
    }
}
