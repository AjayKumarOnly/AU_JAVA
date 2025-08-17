import java.util.HashMap;
import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Name : S. Ajay Kumar");
        System.out.println("Roll No : 2024503701");
        String str = sc.nextLine();
        for (char c : str.toCharArray()) {
            
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        System.out.println(map);
    }
}