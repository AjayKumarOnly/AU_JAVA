import java.util.Scanner;

public class MatrixRowSum {
    public static void main(String[] args) {
        System.out.println("Name : S. Ajay Kumar");
        System.out.println("Roll No : 2024503701");
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int[] rowSums = new int[3];

        System.out.println("Enter 3x3 matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
                rowSums[i] += matrix[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Sum of row " + (i + 1) + ": " + rowSums[i]);
        }

        int maxSum = rowSums[0];
        int maxRow = 1;
        for (int i = 1; i < 3; i++) {
            if (rowSums[i] > maxSum) {
                maxSum = rowSums[i];
                maxRow = i + 1;
            }
        }

        System.out.println("Row with highest sum: Row " + maxRow);

        sc.close();
    }
}
