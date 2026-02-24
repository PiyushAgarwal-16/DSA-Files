public class temp1 {

    static int[] rowMoves = {2, 2, 1, -1, -2, -2, -1, 1};
    static int[] colMoves = {1, -1, 2, 2, 1, -1, -2, -2};

    public static boolean knightTour(int[][] board, int r, int c, int move) {
        int n = board.length;

        // Base case: all cells visited
        if (move == n * n) {
            return true;
        }

        // Try all 8 knight moves
        for (int i = 0; i < 8; i++) {
            int newR = r + rowMoves[i];
            int newC = c + colMoves[i];

            if (isSafe(board, newR, newC)) {
                board[newR][newC] = move;

                if (knightTour(board, newR, newC, move + 1))
                    return true;

                // 🔁 Backtrack
                board[newR][newC] = 0;
            }
        }

        return false;
    }

    public static boolean isSafe(int[][] board, int r, int c) {
        int n = board.length;
        return (r >= 0 && c >= 0 && r < n && c < n && board[r][c] == 0);
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] board = new int[n][n];

        board[0][0] = 0;   // starting cell

        if (knightTour(board, 0, 0, 1)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}