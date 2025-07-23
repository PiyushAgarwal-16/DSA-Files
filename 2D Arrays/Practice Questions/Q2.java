// Question 2 :Print out the sum of the numbers inthe second row of the “nums” array.Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };Output - 18

public class Q2{
    public static int secondRow(int matrix[][]){
        int i = 1; // second row
        int sum = 0;
        for(int j = 0; j<matrix[1].length; j++){
            sum += matrix[i][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] nums = { {1,4,9},{11,41,3},{2,2,3} };
        System.out.println(secondRow(nums));
    }
}