import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        System.out.println("Name : S. Ajay Kumar");
        System.out.println("Roll No : 2024503701");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        float mark1 = sc.nextFloat();

        System.out.print("Enter marks for Subject 2: ");
        float mark2 = sc.nextFloat();

        System.out.print("Enter marks for Subject 3: ");
        float mark3 = sc.nextFloat();

        float total = mark1 + mark2 + mark3;
        float average = total / 3;

        // Check if any subject is less than 50
        boolean passStatus = (mark1 >= 50 && mark2 >= 50 && mark3 >= 50);
        char grade;

        if (!passStatus) {
            grade = 'U'; // U for fail
        } else if (average >= 90) {
            grade = 'S';
        } else if (average >= 80) {
            grade = 'A';
        } else if (average >= 70) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else {
            grade = 'U';
        }

        System.out.println("\n--- Student Result ---");
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Pass Status: " + passStatus);

        sc.close();
    }
}
