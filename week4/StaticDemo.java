public class StaticDemo {

    static int staticVar;

    int instanceVar;

    static {
        staticVar = 100;
        System.out.println("Static block executed. staticVar = " + staticVar);
    }

    public StaticDemo(int val) {
        this.instanceVar = val;
    }

    public void showInstanceVar() {
        System.out.println("Instance variable = " + instanceVar);
    }

    public static void staticMethod() {
        System.out.println("Inside staticMethod()");

        System.out.println("Static variable = " + staticVar);

        StaticDemo obj = new StaticDemo(50);
        System.out.println("Accessing instanceVar via object: " + obj.instanceVar);
        obj.showInstanceVar();
    }

    public static void main(String[] args) {
        System.out.println("Name : S.Ajay Kumar \nRoll No : 202450370");
        System.out.println("Main method starts");

        StaticDemo.staticMethod();

        StaticDemo obj2 = new StaticDemo(200);
        obj2.showInstanceVar();
    }
}
