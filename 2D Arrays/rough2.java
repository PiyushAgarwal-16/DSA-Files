public class rough2{
    public static void diagonalSum(int matrix[][]){
        int m = matrix.length; // rows
        int n = matrix[0].length; // column
        int sum1 = 0;

        if(m != n){
            System.out.print("This is matrix is not a square matrix.");
            return;
        }
        

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(i == j || i+j == m-1){
                    sum1 += matrix[i][j];
                }
            }
        }
        System.out.println("Sum: " + sum1);
    }
    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        int matrix2[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int matrix3[][] = {
            {1}
        };

        int[][] matrix4 = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        diagonalSum(matrix);
        diagonalSum(matrix2);
        diagonalSum(matrix3);
        diagonalSum(matrix4);
    }
}