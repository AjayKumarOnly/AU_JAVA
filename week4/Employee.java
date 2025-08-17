public class Employee {

    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.printDetails(); 
    }

    public void updateDetails(String name, int id) {
        this.name = name;
        this.id = id;
        this.display(); 
    }

    public void printDetails() {
        System.out.println("Constructor - Name: " + this.name + ", ID: " + this.id);
    }

    public void display() {
        System.out.println("Updated - Name: " + this.name + ", ID: " + this.id);
    }

    public static void main(String[] args) {
        System.out.println("Name : S.Ajay Kumar \nRoll No : 202450370");
        Employee e1 = new Employee("Ajay", 101);
        e1.updateDetails("Kumar", 202);
    }
}
