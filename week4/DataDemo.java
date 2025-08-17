public class DataDemo {

    static int classLevelCounter = 0;
    int objectLevelCounter = 0;

    public static void showClassInfo() {
        System.out.println("Class-level counter (shared): " + classLevelCounter);
    }

    public void incrementCounters() {
        classLevelCounter++;
        objectLevelCounter++;
    }

    public void showObjectInfo() {
        System.out.println("Class-level counter (shared): " + classLevelCounter);
        System.out.println("Object-level counter (unique): " + objectLevelCounter);
    }

    public static void main(String[] args) {
        System.out.println("Name : S.Ajay Kumar \nRoll No : 202450370");
        DataDemo.showClassInfo();

        System.out.println("\n--- Creating obj1 ---");
        DataDemo obj1 = new DataDemo();
        obj1.incrementCounters();
        obj1.showObjectInfo();

        System.out.println("\n--- Creating obj2 ---");
        DataDemo obj2 = new DataDemo();
        obj2.incrementCounters();
        obj2.showObjectInfo();

        System.out.println("\n--- Back to obj1 ---");
        obj1.showObjectInfo();

        System.out.println("\n--- Calling static method again ---");
        DataDemo.showClassInfo();
    }
}
