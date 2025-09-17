import java.util.Scanner;

public class MathCalculator {
    public static int findFactorial(int n ) {
        int fact = 1;
        try{
            if(n < 0) throw new IllegalArgumentException("n is negative");
            if(n>20) throw new ArithmeticException("n is greater than 20");

            for(int i =2; i <= n;i++){
                fact *= i;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }


        return fact;
    }
    public static double safeDivide(double dividend , double divisor) throws Exception{
        try{
            if(divisor == 0.0) throw new ArithmeticException("divisor is zero");
            if(divisor == 0.0 && dividend == 0.0) throw new IllegalArgumentException("Both are zero");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }

        return  (dividend / divisor);
    }
    public static int calculatePower(int base, int exp){
        int result = 0;
        try {
        if(base == 0 && exp < 0){
            throw new IllegalArgumentException("Base is Zero and exp is negative");
        }
        if (base < 0 && exp < 0) {
            throw new ArithmeticException("Both are negative");
        }
        if(base == 0 && exp == 0){
             throw new UnsupportedOperationException("Both are zero");
        }
            result = (int) Math.pow(base, exp);

        } catch (IllegalArgumentException e) {
            System.out.println("This is Illegal Argument Exception");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (UnsupportedOperationException e) {
            System.out.println("Unsupported Operation Exception");
        }
        return result;
    }
    public static void main(String[]args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name : Ajay Kumar ");
        System.out.println("Roll no : 2024503701");

        System.out.println("Calculate Power : " +calculatePower(2,3));
        System.out.println("Factorial : " +findFactorial(5));
        System.out.println("Safe Divide : " +safeDivide(10,2));

        System.out.println("Calculate Power : "+calculatePower(0,-2));
        System.out.println("Calculate Power : "+calculatePower(-3,-2));
        System.out.println("Calculate Power : "+calculatePower(0,0));

        System.out.println("Factorial : " + findFactorial(-5));
        System.out.println("Factorial : " + findFactorial(25));
        System.out.println("Safe Divide : " + safeDivide(5,0));
        System.out.println("Safe Divide : " + safeDivide(0,0));
    }
}
