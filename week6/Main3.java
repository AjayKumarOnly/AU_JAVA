class Animals{
    void move(){
        System.out.println("Animals can move...");
    }
    void move(String direction){
        System.out.println("Animals can move " + direction + " direction...");
    }
    void move(int distance){
        System.out.println("Animals can move " + distance + " meters...");
    }
    void move(String direction, int distance){
        System.out.println("Animals can move " + direction + " for " + distance + " meters...");
    }
}
class Dogs extends Animals{
    @Override
    void move(){
        System.out.println("Dogs can run...");
    }
    @Override
    void move(String direction){
        System.out.println("Dogs can run in " + direction + " direction...");
    }
    @Override
    void move(int distance){
        System.out.println("Dogs can run " + distance + " meters...");
    }
    @Override
    void move(String direction, int distance){
        System.out.println("Dogs can run " + direction + " for " + distance + " meters...");
    }
}
class Cats extends Animals{
    @Override
    void move(){
        System.out.println("Cats can jump...");
    }
    @Override
    void move(int distance){
        System.out.println("Cats can jump " + distance + " meters...");
    }
    @Override
    void move(String direction){
        System.out.println("Cats can jump in " + direction + " direction...");
    }
    @Override
    void move(String direction , int distance){
        System.out.println("Cats can jump " + direction + " for " + distance + " meters...");
    }   
}
class Bird extends Animals{
    @Override
    void move(){
        System.out.println("Birds can fly");
    }
    @Override
    void move(String direction){
        System.out.println("Birds can fly in " + direction + " direction...");
    }
    @Override
    void move(int distance){
        System.out.println("Birds can fly " + distance + " meters...");
    }
    @Override
    void move(String direction , int distance){
        System.out.println("Birds can fly " + direction + " for " + distance + " meters...");
    }
}
public class Main3 {
    public static void main(String[] args) {
        System.out.println("Name : S.Ajay Kumar");
        System.out.println("Roll no : 2024503701");
        Animals[] animalArray;
        animalArray = new Animals[3];
        animalArray[0] = new Dogs();
        animalArray[1] = new Cats();
        animalArray[2] = new Bird();
       
        for (Animals animal : animalArray) {
            animal.move();
            animal.move("North");
            animal.move(100);
            animal.move("East", 50);
            System.out.println();
        }
        
         Dogs dog = new Dogs();
        dog.move();
        dog.move("South");
        dog.move(90);
        dog.move("East", 99);
       
    }
}
