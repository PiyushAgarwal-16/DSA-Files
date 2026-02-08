public class rough3{
    public static void staircaseSearch(int matrix[][], int key){
        int i = matrix.length-1;
        int j = 0;
        // writing condition for (n-1,0)
        while(j < matrix[0].length && i >= 0){

            if(matrix[i][j] == key){
                System.out.println("Key found at " + i + " " + j);
                return;
            }
            else if(matrix[i][j] > key){
                i--;
            }
            else if(matrix[i][j] < key){
                j++;
            }
        }
        System.out.println("Key not found");

    }
    public static void main(String args[]){
        int matrix[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29, 37,48},
            {32,33, 39,50}
        };

        staircaseSearch(matrix, 35);
    }
}