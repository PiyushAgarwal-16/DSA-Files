import java.util.Scanner;

public class TriangleMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Create jagged 2D array to represent right angled triangle matrix
        int[][] matrix = new int[n][];
        int num = 1;

        for (int col = 0; col < n; col++) {
            // Each column has (n - col) elements
            matrix[col] = new int[n - col];
            for (int row = 0; row < n - col; row++) {
                matrix[col][row] = num++;
            }
        }

        // Print row-wise
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(matrix[col][row - col]);
                if (col < row) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
