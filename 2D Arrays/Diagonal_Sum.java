// we solve this problem only for n x n matrix, meaning square matrix

public class Diagonal_Sum{
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        for(int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[0].length; j++){
                if(i == j){
                    sum += matrix[i][j];
                }
                else if(i + j == matrix.length-1){
                    sum += matrix[i][j];
                } // the overlapping element problem is covered by 
                // else if function
            }
        }
        // This code is not optimized, we can write much better code

        for (int i = 0; i<matrix.length; i++){
            // primary diagonal
            sum += matrix[i][i];

            // secondary diagonal
            // i + j = n - 1
            // j = n - 1 - i

            if(i != matrix.length - i - 1){ // {if conditions} for overlapping element
            // here when the rows and columns will be equal it won't add it again in the sum
            // as when the rows = columns, it would already have been added in the primary diagonal
            
            // This if conditions basically states that the code line below won't run for the 
            // elements which have i == j (because we have already included them above)
            sum += matrix[i][matrix.length - 1 - i];
            }

        }

        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        System.out.println(diagonalSum(matrix));
    }
}