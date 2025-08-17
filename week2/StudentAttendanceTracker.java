import java.util.Scanner;

public class StudentAttendanceTracker {
    public static void main(String[] args) {
        System.out.println("Name : S. Ajay Kumar");
        System.out.println("Roll No : 2024503701");
        int[][] attendance = new int[5][8];
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Scanner scanner = new Scanner(System.in);

        for (int day = 0; day < 5; day++) {
            System.out.println("Enter attendance for " + days[day] + " (1 for present, 0 for absent):");
            for (int hour = 0; hour < 8; hour++) {
                System.out.print("Hour " + (hour + 1) + ": ");
                attendance[day][hour] = scanner.nextInt();
            }
            System.out.println();
        }

        int totalPresent = 0;
        int totalHours = 5 * 8;

        System.out.println("Daily Attendance Percentages:");
        for (int day = 0; day < 5; day++) {
            int dailyPresent = 0;
            for (int hour = 0; hour < 8; hour++) {
                dailyPresent += attendance[day][hour];
            }
            totalPresent += dailyPresent;
            double dailyPercentage = (dailyPresent / 8.0) * 100;
            System.out.printf("%s: %.2f%%\n", days[day], dailyPercentage);
        }

        double weeklyPercentage = (totalPresent / (double) totalHours) * 100;
        System.out.printf("\nOverall Weekly Attendance: %.2f%%\n", weeklyPercentage);
    }
}
