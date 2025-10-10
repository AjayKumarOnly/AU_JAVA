import java.awt.*;
import java.security.spec.RSAOtherPrimeInfo;

class Sample {
       public synchronized void display(String str){
            for(int i=0;i<str.length();i++){
                System.out.print(str.charAt(i));
            }
        }
}
public class synchronize {
    public static void main(String[] args) {
        System.out.println("Name : Ajay Kumar");
        System.out.println("Roll no : 2024503701");
        Sample s1 = new Sample();
        Sample s2 = new Sample();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                s1.display("Java");
            }
        },"Thread Aj");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                s2.display("Programming");
            }
        },"Thread AK");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.start();
        t2.start();

    }
}
