import java.util.*;
public class CountWords {
    public static void main(String[] args) {
       int wordCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Name : S. Ajay Kumar");
        System.out.println("Roll No : 2024503701");
        System.out.println("Enter the sentence: ");
        String wordString = sc.nextLine();
        if(wordCount == 0 && wordString.isEmpty()) {
            System.out.println("No words found.");
        } else {
            String[] words = wordString.trim().split("\\s+");
            wordCount = words.length;
            System.out.println("Total number of words: " + wordCount);
        }
        

       
    }
}
