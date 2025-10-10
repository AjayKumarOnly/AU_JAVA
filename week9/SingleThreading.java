class Addi extends Thread{
    int x , y = 0;
    Addi(int a, int b){
        this.x = a;
        this.y = b;
    }
    void sum(){
        System.out.println("Addition : " + (x + y ) );
    }
    public void run(){
        sum();
    }
}
class Subr extends Thread{
    int x , y = 0;
    Subr(int a, int b){
        this.x = a;
        this.y = b;
    }
    void sub(){
        System.out.println("Subraction : " + (x-y));
    }
    public void run(){
        sub();
    }
}

public class SingleThreading {
    public static void main(String[] args) {
        System.out.println("Name : Ajay Kumar ");
        System.out.println("Roll No : 2024503701");

        Addi obj1 = new Addi(57898789,344456969);
        Subr obj2 = new Subr(59999999,3999999);

        double startingTime = System.currentTimeMillis();

        obj1.start();
        obj2.start();
        try{
            Thread.sleep(10);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        double endingTiming = System.currentTimeMillis();

        double speed = endingTiming -  startingTime;
       System.out.println("Speed of Execution : " + speed );

    }
}
