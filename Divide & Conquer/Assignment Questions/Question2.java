import java.util.Arrays;

public class Question2{
    public static int majority(int arr[]){ // time complexity - O(n log n)
        Arrays.sort(arr);
        int counti = 1;
        int countm = 0;
        int element = 0;

        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                counti++;
                if(countm < counti){
                    countm = counti;
                    element = arr[i];
                }
            }
            else{
                counti = 1;
            }
        }
        return element;
    }

    public static int majorityOptimized(int arr[]){ // this is not optimized, there is one algorithm which is more optimized for this question
        Arrays.sort(arr);
        return arr[(arr.length)/2];
    }

    public static int mooresVoting(int arr[]){ // Time Complexity - O(n)
        int frequency = 0;
        int answer = 0;

        for(int i = 0; i<arr.length; i++){
            if(frequency == 0){
                answer = arr[i];
            }

            if(arr[i] == answer){
                frequency++;
            }
            else{
                frequency--;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int nums[] = {9, 99, 99, 55, 99, 99, 6, 99, 31, 99, 100, 99, 66, 99, 30};
        System.out.println("Sub Optimized Method: " + majorityOptimized(nums));
        System.out.println("Optimized Method: " + mooresVoting(nums));

        // for(int num: nums){
        //     System.out.print(num + " ");
        // }
    }
}

// I made both the solution myself