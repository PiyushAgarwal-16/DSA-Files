public class Search_in_Sorted_Matrix{

    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length - 1;

        // we are writing conditions when starting the search with (0, m-1) cell
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("found key at ("+ row + ", " + col + ")" );
                return true;
            }

            else if(key < matrix[row][col]){
                col--;
            }

            else if(key > matrix[row][col]){
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }


public static boolean staircaseSearch1(int matrix[][], int key){
        int row = matrix.length-1, col = 0;

        // we are writing conditions when starting the search with (0, m-1) cell
        while(col < matrix[0].length && row >= 0){
            if(matrix[row][col] == key){
                System.out.println("found key at ("+ row + ", " + col + ")" );
                return true;
            }

            else if(key < matrix[row][col]){
                row--;
            }

            else if(key > matrix[row][col]){
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        
        int key = 40;

        staircaseSearch1(matrix, key);
    }
}