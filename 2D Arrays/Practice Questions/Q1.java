// Question 1 :Print the number of 7’s that are in the 2d array.Example :Input - int[][] array = { {4,7,8},{8,8,7} };Output - 2

public class Q1{
    public static int linearSearch(int matrix[][], int target){
        int counter = 0;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == target){
                    counter++;
                }
            }
        }
        return counter;
    }
    public static void main(String args[]){
        int array[][] = { {4,7,8},{8,8,7} };
        int key = 8;
        System.out.println(linearSearch(array, key));
    }
}