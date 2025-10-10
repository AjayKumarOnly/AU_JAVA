class Add extends Thread{
    int x , y = 0;
    Add(int a, int b){
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
class Sub extends Thread{
    int x , y = 0;
    Sub(int a, int b){
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

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Name : Ajay Kumar");
        System.out.println("Roll no : 2024503701");

        Add obj1 = new Add(5,3);
        Sub obj2 = new Sub(5,3);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        double start = System.currentTimeMillis();
        t1.start();
        try{
        Thread.sleep(10);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        t2.start();
        double end = System.currentTimeMillis();
        System.out.println( "Speed : " + (end - start));
    }
}
