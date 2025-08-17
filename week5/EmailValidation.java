import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {
        System.out.println("Name : S. Ajay Kumar");
        System.out.println("Roll No : 2024503701");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        if (isValidEmail(email)) {
            String[] parts = email.split("@");
            String username = parts[0];
            String domain = parts[1];
            System.out.println("Valid Email");
            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
        } else {
            System.out.println("Invalid Email");
        }
        
        sc.close();
    }

    public static boolean isValidEmail(String email) {
        if (email.indexOf('@') != email.lastIndexOf('@')) return false;


        String[] parts = email.split("@");
        if (parts.length != 2) return false;

        String username = parts[0];
        String domain = parts[1];

        if (!username.matches("[a-zA-Z0-9_\\-+]{1,25}")) {
            return false;
        }

        if (!(domain.endsWith(".com") || domain.endsWith(".in") || domain.endsWith(".edu"))) {
            return false;
        }

        return true;
    }
}
