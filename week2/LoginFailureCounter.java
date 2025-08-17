import java.util.Scanner;

public class LoginFailureCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int failCount = 0;

        while (true) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (username.equals("admin") && password.equals("admin123")) {
                System.out.println("Admin login successful.");
                break;
            } else if (!username.equals("admin") && !password.equals("user123")) {
                failCount++;
                System.out.println("Login failed. Fail count: " + failCount);
            } else {
                System.out.println("Login attempt not counted as failure.");
            }
        }

        sc.close();
    }
}
