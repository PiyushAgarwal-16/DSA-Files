public class KnightTour{

    public static boolean knightMoves(int chess[][], int r, int c, int counter){
        // base case
        int n = chess.length;
        if(r < 0 || c < 0 || r >= n|| c >= n || chess[r][c] != 0){
            return false;
        }

        // recursive case
        chess[r][c] = counter;
        if(counter == n*n){
            return true;
        }
        counter++;
        boolean ans1 = knightMoves(chess, r+2, c-1, counter);
        boolean ans2 = knightMoves(chess, r+2, c+1, counter);
        boolean ans3 = knightMoves(chess, r+1, c+2, counter);
        boolean ans4 = knightMoves(chess, r-1, c+2, counter);
        boolean ans5 = knightMoves(chess, r-2, c+1, counter);
        boolean ans6 = knightMoves(chess, r-2, c-1, counter);
        boolean ans7 = knightMoves(chess, r-1, c-2, counter);
        boolean ans8 = knightMoves(chess, r+1, c-2, counter);
        if(!(ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8)){
            chess[r][c] = 0;
        }

        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;

    }

    public static void printMatrix(int chess[][]){
        for(int i = 0; i<chess.length; i++){
            for(int j = 0; j<chess[0].length; j++){
                System.out.print(chess[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int chess[][] = new int[n][n];  
        knightMoves(chess, 0, 0, 1);
        printMatrix(chess);
    }
}