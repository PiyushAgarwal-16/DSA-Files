// Question 3 : Write a program to Find Transpose of a Matrix. What is Transpose? Transpose of a matrix is the process of swapping the rows to columns. 

public class Q3{
    public static void transpose(int matrix[][]){
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for(int col = 0; col < matrix[0].length; col++){
            for(int row = 0; row < matrix.length; row++){
               transpose[col][row] = matrix[row][col];
            }
        }
        for(int i = 0; i<transpose.length; i++){
            for(int j = 0; j<transpose[0].length; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8}};
        transpose(matrix);

    }
}