// This implementation doesn't use the extra visited array to mark the down the visited cells

public class Rat_in_a_maze{
    public static void findAns(int[][] maze, int r, int c, String ans, String path){
        // base case
        int n = maze.length;
        if(r < 0 || c < 0 || r >= n || c >= n || maze[r][c] == 0 || maze[r][c] == -1){
            return;
        }

        if(r == n-1 && c == n-1){
            ans += path;
            System.out.println(ans);
            return;
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

        findAns(maze, r+1, c, ans, path + "D");
        findAns(maze, r-1, c, ans, path +"U");
        findAns(maze, r, c-1, ans, path + "L");
        findAns(maze, r, c+1, ans, path + "R");
        maze[r][c] = 1;
        // return; // Here I have written it just for my own understanding
        // in functions who have void return type, as soon as the java it's closing } bracket, it returns


        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<n; j++){
        //         System.out.print(maze[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("--------");

    }

    public static void main(String[] args) {
    // int maze[][] = {
    //     {1, 0, 1, 1, 1},
    //     {1, 1, 1, 0, 1},
    //     {0, 1, 0, 1, 1},
    //     {1, 1, 1, 1, 0},
    //     {0, 0, 0, 1, 1}
    // };

//     int maze[][] = {
//     {1, 1, 1},
//     {1, 0, 1},
//     {1, 1, 1}
// };
        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 1, 0},
            {1, 0, 1, 0},
            {1, 1, 1, 1}
        };

        findAns(maze, 0, 0, "", "");
    }
}

