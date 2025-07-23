public class Question1{
    public static void indices(int index, int key, int[] arr){
        if(index == arr.length){
            return;
        }

        if(arr[index] == key){
            System.out.print(index + " ");
        }

        indices(index+1, key, arr);

    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        indices(0, key, arr);
    }
}


// Question 1: For a given integer array of size N, you have to find all the occurrences (indices) of a given element (Key) and print them. 
// Use a recursive function to solve this problem. 
// Sample Input: arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2 
// Sample Output: 1 5 7 8