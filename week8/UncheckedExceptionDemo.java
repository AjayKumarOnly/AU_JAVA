import java.util.Scanner;

class Calculator {
    public int divide(int a, int b) {
        return a / b;
    }

    public int parseAndAdd(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        return n1 + n2;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Name : Ajay Kumar S");
        System.out.println("Roll No : 2024503701");
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        try {
            System.out.print("Enter first number: ");
            String input1 = sc.nextLine();

            System.out.print("Enter second number: ");
            String input2 = sc.nextLine();

            int sum = calc.parseAndAdd(input1, input2);
            System.out.println("Sum = " + sum);

            int n1 = Integer.parseInt(input1);
            int n2 = Integer.parseInt(input2);

            int sub = calc.subtract(n1, n2);
            System.out.println("Difference = " + sub);

            int mul = calc.multiply(n1, n2);
            System.out.println("Product = " + mul);

            System.out.print("Enter dividend: ");
            int a = sc.nextInt();

            System.out.print("Enter divisor: ");
            int b = sc.nextInt();

            int result = calc.divide(a, b);
            System.out.println("Division Result = " + result);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter only numbers.");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero not allowed.");
        }

        System.out.println("Program continues...");
        sc.close();
    }
}
