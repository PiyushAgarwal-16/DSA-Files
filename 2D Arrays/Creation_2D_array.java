import java.util.*;

public class Creation_2D_array{
    public static void largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest element is " + largest);        
    }

    public static void smallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("smallest element is " + smallest);        
    }

    public static boolean search(int matrix[][], int key){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("key found at cell " + "(" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length; // rows
        int m = matrix[0].length; // columns

        Scanner sc = new Scanner(System.in);
        
        // input
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // search(matrix, 5);
        largest(matrix);
        smallest(matrix);

    }
}