public class DemoException {
    public static void main(String[] args) {
        System.out.println("Name : Ajay Kumar ");
        System.out.println("Roll no : 2024503701");

        double a = 7.0/0;
        System.out.println("i am excutable...");
        int res = 0;
        try{
            res = 7/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("i am not  excutable...");
//        double a ;
//        a = 7.0/0;
//        System.out.println("i am excutable...");
//        int b = 4/0;
    }
}
