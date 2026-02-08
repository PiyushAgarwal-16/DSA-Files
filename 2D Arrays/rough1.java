public class rough1{
    public static void spiralMatrix(int matrix[][]){
        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int colStart = 0;
        int colEnd = matrix[0].length-1;

        while(rowStart<=rowEnd && colStart <= colEnd){

            //top
            for(int i = colStart; i<=colEnd; i++){
                System.out.print(matrix[rowStart][i] + " ");
            }
            rowStart++;

            //left part
            for(int i = rowStart; i<=rowEnd; i++){
                System.out.print(matrix[i][colEnd] + " ");
            }
            colEnd--;


            //bottom part
            for(int i = colEnd; i>=colStart; i--){
                if(rowStart > rowEnd){
                    break;
                }
                System.out.print(matrix[rowEnd][i] + " ");
            }
            rowEnd--;


            // right part
            for(int i = rowEnd; i>=rowStart; i--){
                if(colStart > colEnd){
                    break;
                }
                
                System.out.print(matrix[i][colStart] + " ");

            }
            colStart++;
        }
    }

    public static void printMatrix(int matrix[][]){
        for (int[] matrix1 : matrix) {
            for (int j = 0; j<matrix[0].length; j++) {
                System.out.print(matrix1[j] + " ");
            }
        }
    }
    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int matrix1[][] = {
            {1,2,3}
        };

        int[][] matrix2 = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        int[][] matrix3 = {
            {1, 2, 3},
            {4, 5, 6}
        };


        // printMatrix(matrix);
        spiralMatrix(matrix3);

    }
}