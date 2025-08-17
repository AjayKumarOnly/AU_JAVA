import java.util.Scanner;

public class VaccineEligibility {
    public static void main(String[] args) {
        System.out.println("Name : S. Ajay Kumar");
        System.out.println("Roll No : 2024503701");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18 && age <= 65) {
            System.out.print("Enter appointment number: ");
            int appointment = sc.nextInt();

            if (appointment >= 100 && appointment <= 999) {
                if (appointment % 2 == 0) {
                    System.out.println("Priority slot assigned");
                } else {
                    System.out.println("Regular slot assigned");
                }

                int lastDigit = appointment % 10;
                switch (lastDigit) {
                    default:
                        System.out.println("Gift: Pen");
                        break;
                }
            } else {
                System.out.println("Invalid appointment number");
            }
        } else {
            System.out.println("Not eligible for vaccine");
        }

        sc.close();
    }
}

