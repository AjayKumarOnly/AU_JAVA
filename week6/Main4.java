class LivingBeings{

    public LivingBeings(String name) {
        System.out.println("Name : " + name);
    }
    void breath(){
        System.out.println("LivingBeings can Breath...");
    }
    void response(){
        System.out.println("LivingBeings can respond...");
    }
    
}
class LandAnimal extends LivingBeings {
    public LandAnimal(String name) {
        super(name);
    }
    void walk() {
        System.out.println("LandAnimal can walk...");
    }
    void noOfLegs() {
        System.out.println("LandAnimals can walk on 2 or 4 legs...");
    }
}
class Dog extends LandAnimal {
    public Dog(String name) {
        super(name);
    }
    void bark() {
        System.out.println("Dog can bark...");
    }
}
class Cat extends LandAnimal {
    public Cat(String name) {
        super(name);
    }
    void meow() {
        System.out.println("Cat can meow...");
    }
}
class Main4 {
    public static void main(String[] args) {
     System.out.println("Name : S.Ajay Kumar");
     System.out.println("Roll no : 2024503701");
     Dog dog = new Dog("Tommy");
     Cat cat = new Cat("Kitty");
     dog.breath();
     dog.response();
     cat.breath();
     cat.response();
    }
}