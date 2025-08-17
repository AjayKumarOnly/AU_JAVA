import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        System.out.println("Name : S. Ajay Kumar");
        System.out.println("Roll No : 2024503701");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        boolean isHot = (fahrenheit > 100);

        System.out.println("\n--- Temperature Report ---");
        System.out.printf("Temperature: %.1f°C (%.1f°F)\n", celsius, fahrenheit);
        System.out.println("Is it hot? " + isHot);

        sc.close();
    }
}
