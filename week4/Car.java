public class Car {

    String brand = "BMW";
    int year=2026;

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        System.out.println("Name : S.Ajay Kumar \nRoll No : 202450370");

        Car c1 = new Car();
        c1.display();
    }
}
