import java.util.Scanner;

public class BMICheck {
    public static void main(String[] args) {
        System.out.println("Name : S. Ajay Kumar");
        System.out.println("Roll No : 2024503701");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);

        boolean isNormal = (bmi >= 18.5 && bmi < 25);

        System.out.println("\n--- BMI Report ---");
        System.out.println("BMI: " + bmi);
        System.out.println("Is BMI Normal? " + isNormal);

        sc.close();
    }
}
