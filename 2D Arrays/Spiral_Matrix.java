public class Spiral_Matrix{
    public static void printSpiral(int matrix[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        while(startrow <= endrow && startcol <= endcol){
            // top part
            for(int j = startcol; j<=endcol; j++){
                System.out.print(matrix[startrow][j] + " ");
                // here the row will be constant
            }

            // right part
            for(int i = startrow+1; i<=endrow; i++){
                System.out.print(matrix[i][endcol] + " ");
            }

            // bottom part
            for(int j = endcol-1; j>=startcol; j--){
                if(startrow == endrow){
                    break; // this condition is for the matrix in which 
                    // there will a singular element left
                }
                System.out.print(matrix[endrow][j] + " ");
            }

            // left part
            for(int i = endrow-1; i>=startrow+1; i--){
                if(startcol == endcol){
                    break; // this condition is for the matrix in which 
                    // there will a singular element left
                }
                System.out.print(matrix[i][startcol] + " ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
        
    }
    

    public static void main(String[] args) {
    int matrix[][] = {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};   

    int matrix1[][] = {{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20},
                        {21,22,23,24,25}}; 
    int matrix2[][] = {{1,2,3,4}};
    int matrix3[][] = {{1},{2},{3},{4}};
    printSpiral(matrix3);
    }

    // Matrix2 and Matrix 3 is example case for the if conditions we put in bottom and left part
}
