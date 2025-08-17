public class Student1 {

    String name;
    int age;

    public Student1() {
        name = "Unknown";
        age = 0;
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        System.out.println("Name: S.Ajay Kumar");
        System.out.println("Roll No: 202450370");
        Student1 s1 = new Student1();
        Student1 s2 = new Student1("Kumar", 22);

        s1.display();
        s2.display();
    }
}
