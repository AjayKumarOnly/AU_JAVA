class Sample1 {
    public synchronized void display(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
    }
}public class Lamda {
    public static void main(String[] args) {
        System.out.println("Name : Ajay Kumar");
        System.out.println("Roll no : 2024503701");
        Sample1 s1 = new Sample1();

        Thread t1 = new Thread(()-> s1.display("Anna University"));
        t1.start();

    }
}


