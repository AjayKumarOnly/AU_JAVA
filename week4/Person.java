public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void compareAge(Person other) {
        if (this.age > other.age) {
            System.out.println(this.name + " is older than " + other.name);
        } else if (this.age < other.age) {
            System.out.println(this.name + " is younger than " + other.name);
        } else {
            System.out.println(this.name + " and " + other.name + " are of the same age");
        }
    }

    public Person getPersonObject() {
        return this;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        System.out.println("Name : S.Ajay Kumar \nRoll No : 202450370");
        Person p1 = new Person("Ajay", 20);
        Person p2 = new Person("Rahul", 22);

        p1.display();
        p2.display();

        p1.compareAge(p2);

        Person returnedPerson = p1.getPersonObject();
        System.out.println("Returned object:");
        returnedPerson.display();
    }
}
