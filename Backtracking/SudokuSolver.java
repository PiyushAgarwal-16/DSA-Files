public class SudokuSolver{

    public static boolean isSafe(int board[][], int r, int c, int num){
        int n = board.length;
        // column checking
        for(int i = 0; i<n; i++){
            if(board[r][i] == num){
                return false;
            }
        }
        // row checking
        for(int i = 0; i<n; i++){
            if(board[i][c] == num){
                return false;
            }
        }

        // grid checking
        int startR = (r/3)*3;
        int startC = (c/3)*3;
        for(int i = startR; i<(startR + 3); i++){
            for(int j = startC; j<(startC + 3); j++){
                if(board[i][j] == num){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolve(int board[][], int r, int c){
        int n = board.length;
        // base case
        if(r == 9){
            return true;
        }
        // recursive case

        int newR = r;
        int newC = c+1;
        if(newC == 9){
            newR = r+1;
            newC = 0;
        }

        if(board[r][c] != 0){
            return sudokuSolve(board, newR, newC);
        }

        for(int digit = 1; digit<=9; digit++){
            if(isSafe(board, r, c, digit)){
                board[r][c] = digit;
                if(sudokuSolve(board, newR, newC)){
                    return true;
                }
                board[r][c] = 0;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int board[][] = {
        {5,3,0,0,7,0,0,0,0},
        {6,0,0,1,9,5,0,0,0},
        {0,9,8,0,0,0,0,6,0},
        {8,0,0,0,6,0,0,0,3},
        {4,0,0,8,0,3,0,0,1},
        {7,0,0,0,2,0,0,0,6},
        {0,6,0,0,0,0,2,8,0},
        {0,0,0,4,1,9,0,0,5},
        {0,0,0,0,8,0,0,7,9}};
        printMatrix(board);
        sudokuSolve(board, 0, 0);
        System.out.println("============================");
        printMatrix(board);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}