public class Rat_in_a_maze_practice_q{
    public static boolean findAns(int[][] maze, int ansMatrix[][], int r, int c, String ans, String path){
        // base case
        int n = maze.length;
        if(r < 0 || c < 0 || r >= n || c >= n || maze[r][c] == 0 || maze[r][c] == -1){
            return false;
        }

        if(r == n-1 && c == n-1){
            ans += path;
            System.out.println(ans);
            int r1 = 0;
            int c1 = 0;
            ansMatrix[r1][c1] = 1;
            for(int i = 0; i<ans.length(); i++){
                switch(ans.charAt(i)){
                    case 'D':
                        r1++;
                        ansMatrix[r1][c1] = 1;
                        break;
                    case 'U':
                        r1--;
                        ansMatrix[r1][c1] = 1;
                        break;
                    case 'L':
                        c1--;
                        ansMatrix[r1][c1] = 1;
                        break;
                    case 'R':
                        c1++;
                        ansMatrix[r1][c1] = 1;
                        break;
                }
            }
            return true;
            
        }

        // recursive case
        maze[r][c] = -1;
        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<n; j++){
        //         System.out.print(maze[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("--------");

        if (findAns(maze, ansMatrix, r + 1, c, ans, path + "D")) return true; // we only return true, not false
        if (findAns(maze, ansMatrix, r - 1, c, ans, path + "U")) return true;
        if (findAns(maze, ansMatrix, r, c - 1, ans, path + "L")) return true;
        if (findAns(maze, ansMatrix, r, c + 1, ans, path + "R")) return true;
        maze[r][c] = 1;

        return false;
        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<n; j++){
        //         System.out.print(maze[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("--------");

    }

    public static void main(String[] args) {
        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 1, 0},
            {1, 0, 0, 0},
            {1, 0, 1, 1}
        };
        
        int n = maze.length;
        int ansMatrix[][] = new int[n][n];
        String ans = "";
        findAns(maze, ansMatrix,  0, 0, ans, "");

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(ansMatrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}