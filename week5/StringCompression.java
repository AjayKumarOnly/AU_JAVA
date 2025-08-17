import java.util.Scanner;

public class StringCompression {
    public static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1; 
        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1; 
            }
        }

        if (compressed.length() < str.length()) {
            return compressed.toString();
        } else {
            return str;
        }        
    }

    public static void main(String[] args) {
        System.out.println("Name : S. Ajay Kumar");
        System.out.println("Roll No : 2024503701");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String result = compressString(input);
        System.out.println("Compressed string: " + result);
        
        sc.close();
    }
}
