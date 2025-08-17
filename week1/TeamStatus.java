import java.util.Scanner;

public class TeamStatus {
    public static void main(String[] args) {
            System.out.println("Name : S. Ajay Kumar");
            System.out.println("Roll No : 2024503701");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter team runs: ");
        int runs = sc.nextInt();

        System.out.print("Enter number of fouls: ");
        byte fouls = sc.nextByte();

        boolean winStatus = (runs >= 50 && fouls <= 5);

        System.out.println("\n--- Team Performance ---");
        System.out.println("Runs: " + runs);
        System.out.println("Fouls: " + fouls);
        System.out.println("Win Status: " + winStatus);

        sc.close();
    }
}
