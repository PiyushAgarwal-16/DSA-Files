public class KnightTour1 {

    public static boolean knightMoves(int chess[][], int r, int c, int counter) {
        int n = chess.length;

        // Invalid move
        if (r < 0 || c < 0 || r >= n || c >= n || chess[r][c] != 0) {
            return false;
        }

        // Mark current cell
        chess[r][c] = counter;

        // If last move reached
        if (counter == n * n) {
            return true;
        }

        // Try all 8 moves (stop immediately if one works)
        if (knightMoves(chess, r + 2, c - 1, counter + 1)) return true;
        if (knightMoves(chess, r + 2, c + 1, counter + 1)) return true;
        if (knightMoves(chess, r + 1, c + 2, counter + 1)) return true;
        if (knightMoves(chess, r - 1, c + 2, counter + 1)) return true;
        
        if (knightMoves(chess, r - 2, c + 1, counter + 1)) return true;
        if (knightMoves(chess, r - 2, c - 1, counter + 1)) return true;
        if (knightMoves(chess, r - 1, c - 2, counter + 1)) return true;
        if (knightMoves(chess, r + 1, c - 2, counter + 1)) return true;

        // Backtrack
        chess[r][c] = 0;
        return false;
    }

    public static void printMatrix(int chess[][]) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 2;
        int chess[][] = new int[n][n];

        if (knightMoves(chess, 0, 0, 1)) {
            printMatrix(chess);
        } else {
            System.out.println("No solution exists");
        }
    }
}