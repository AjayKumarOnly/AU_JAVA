import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name : S. Ajay Kumar");
        System.out.println("Roll No : 2024503701");
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

    }
}
