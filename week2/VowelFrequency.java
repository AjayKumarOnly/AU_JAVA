import java.util.Scanner;

public class VowelFrequency {
    public static void main(String[] args) {
        System.out.println("Name : S. Ajay Kumar");
        System.out.println("Roll No : 2024503701");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        char[] chars = input.toCharArray();

        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

        for (char c : chars) {
            if (c == 'a') countA++;
            else if (c == 'e') countE++;
            else if (c == 'i') countI++;
            else if (c == 'o') countO++;
            else if (c == 'u') countU++;
        }

        System.out.println("Frequency of vowels:");
        System.out.println("a: " + countA);
        System.out.println("e: " + countE);
        System.out.println("i: " + countI);
        System.out.println("o: " + countO);
        System.out.println("u: " + countU);

        sc.close();
    }
}
