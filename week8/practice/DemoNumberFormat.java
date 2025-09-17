import java.util.Scanner;

public class DemoNumberFormat {
    public static void main(String[] args) {
        System.out.println("Name : Ajay Kumar ");
        System.out.println("Roll no : 2024503701");
        Scanner sc = new Scanner(System.in);
        int a,b,res = 0;
        try{
            System.out.println("Enter a : ");
            a = sc.nextInt();
            System.out.println("Enter b : ");
            b = Integer.parseInt(sc.next());
            res = a+b;

        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        finally {
            System.out.println(res);
        }
    }
}
