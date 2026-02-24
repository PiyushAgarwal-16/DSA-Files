public class Rat_in_a_maze_visited
{
    public static void findAns(int mat[][], int visited[][], int r, int c, String ans, String path){
        // base case
        int n = mat.length;
        if(r < 0 || c < 0 || r >= n || c >= n || mat[r][c] == 0 || visited[r][c] == 1){
            return;
        }

        if(r == n-1 && c == n-1){
            ans += path;
            System.out.println(ans);
            return;
        }

        // recursive case
        visited[r][c] = 1;
        findAns(mat, visited, r+1, c, ans, path+"D");
        findAns(mat, visited, r-1, c, ans, path +"U");
        findAns(mat, visited, r, c-1, ans, path + "L");
        findAns(mat, visited, r, c+1, ans, path + "R");
        visited[r][c] = 0;

    }

    public static void main(String[] args) {
    int maze[][] = {
        {1, 0, 1, 1, 1},
        {1, 1, 1, 0, 1},
        {0, 1, 0, 1, 1},
        {1, 1, 1, 1, 0},
        {0, 0, 0, 1, 1}
    };
        
        int n = maze.length;
        int visited[][] = new int[n][n];

        findAns(maze, visited, 0, 0, "", "");
    }
}