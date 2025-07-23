public class Max_Subarray_Sum_Part3_Kadane{
    public static void kadane(int numbers[]) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            currsum += numbers[i];
            if(currsum < 0){
                currsum = 0;
            }

            if(maxSum<currsum){
                maxSum = currsum;
            } // Alternative
            // maxSum = Math.max(currsum, maxSum);
        }
        System.out.println("Max Sum = " + maxSum);
    }
    
    public static void main(String args[]){
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(numbers);

    }
}

// This won't work if all the elements of array is negative, for that
// we will have to write another case, which is my homework