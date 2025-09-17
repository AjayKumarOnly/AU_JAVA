class LivingBeing{
    void breath(){
        System.out.println("LivingBeings can Breath...");
    }
    void response(){
        System.out.println("LivingBeings can Respond...");
    }
}
class Animal extends LivingBeing{
    void walk(){
        System.out.println("Animals can Walk...");
    }
    void noOfLegs(){
        System.out.println("Animals can walk on 2 or 4 legs...");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Cats can Meow...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dogs can Bark...");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        System.out.println("Name : S.Ajay Kumar");
        System.out.println("Roll no : 2024503701");
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.breath();
        dog.response();
        dog.walk();
        dog.noOfLegs();
        dog.bark();
        cat.meow();
    }
}
