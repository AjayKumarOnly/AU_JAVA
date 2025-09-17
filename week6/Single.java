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
public class Single{
    public static void main(String[] args) {
        System.out.println("Name : S.Ajay Kumar");
        System.out.println("Roll no : 2024503701");
        Animal animal = new Animal();
        animal.breath();
        animal.response();
        animal.walk();
        animal.noOfLegs();
    }
}