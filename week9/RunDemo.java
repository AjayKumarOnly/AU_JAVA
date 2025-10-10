class Multip implements Runnable{
    int x , y = 0;
    Multip(int x ,int y){
        this.x = x;
        this.y = y;
    }
    void mul(){
        System.out.println("Multiply : " + (x + y ) );
    }
    public void run(){
        mul();
    }
}
class Div implements Runnable{
    int x , y = 0;
    Div(int a, int b){
        this.x = a;
        this.y = b;
    }
    void div(){
        System.out.println("Division : " + (x-y));
    }
    public void run(){
        div();
    }
}
public class RunDemo {
    public static void main(String[] args) {
        System.out.println("Name : Ajay Kumar");
        System.out.println("Roll no : 2024503701");

        Div obj = new Div(10,2);
        Multip mul = new Multip(10,7);

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(mul);

        t1.start();
        t2.start();
    }
}
