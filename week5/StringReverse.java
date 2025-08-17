import java.util.Scanner;
class ClassReverse{
   static String reverseString(String word){
        String reversed = new StringBuilder(word).reverse().toString();
        return reversed;
    }
}
public class StringReverse {
    public static void main(String[] args) {
        ClassReverse rv = new ClassReverse();
        Scanner sc = new Scanner(System.in);
        System.out.println("Name : S. Ajay Kumar");
        System.out.println("Roll No : 2024503701");
        System.out.println("Enter the String to Reverse : ");
        String userInput = sc.nextLine();
        String reversed = rv.reverseString(userInput);
        System.out.println("Reversed String: " + reversed);
    }
}
