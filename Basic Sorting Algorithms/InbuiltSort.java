import java.util.*;

public class InbuiltSort{
    public static void printArr(Integer arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Integer arr[] = {5,4,2,1,3};
        Integer arr2[] = {5,4,2,1,3};
        Arrays.sort(arr);
        Arrays.sort(arr2, 0, 3); // Here we can pass 2 more arguments,
        // starting index and ending index
        // so we can sort a part of the array using this
        // also the last ending index is non-inclusive,
        // meaning to sort till index 2, we have to give 3
        printArr(arr);
        printArr(arr2);
        Arrays.sort(arr, Collections.reverseOrder()); // For sorting in decreasing order
        // Collections.reverseOrder will not work with 'int' array
        // so we have to create 'Integer' arrays
        printArr(arr);
    }
}