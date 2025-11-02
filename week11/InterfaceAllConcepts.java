interface Animal {
    int legs = 4;
    void sound();
    void eat();
    default void sleep() {
        System.out.println("Animals usually sleep at night.");
    }
    static void info() {
        System.out.println("All animals belong to the Animal Kingdom.");
    }
}

interface Pet {
    void play();
}

interface WildAnimal extends Animal {
    void hunt();
}

class Dog implements Animal, Pet {
    public void sound() {
        System.out.println("Dog barks");
    }
    public void eat() {
        System.out.println("Dog eats bones");
    }
    public void play() {
        System.out.println("Dog loves to play with humans");
    }
}

class Lion implements WildAnimal {
    public void sound() {
        System.out.println("Lion roars");
    }
    public void eat() {
        System.out.println("Lion eats meat");
    }
    public void hunt() {
        System.out.println("Lion hunts other animals");
    }
}

public class InterfaceAllConcepts {
    public static void main(String[] args) {

        System.out.println("Name  : Ajay Kumar" );
        System.out.println("Roll no : 2024503701");
        System.out.println("=== Interface Example in Java ===\n");

        Animal.info();

        Dog dog = new Dog();
        System.out.println("\nDog Details:");
        dog.sound();
        dog.eat();
        dog.play();
        dog.sleep();
        System.out.println("Dog has " + Animal.legs + " legs.");

        Lion lion = new Lion();
        System.out.println("\nLion Details:");
        lion.sound();
        lion.eat();
        lion.hunt();
        lion.sleep();

        System.out.println("\n=== End of Interface Demo ===");
    }
}
