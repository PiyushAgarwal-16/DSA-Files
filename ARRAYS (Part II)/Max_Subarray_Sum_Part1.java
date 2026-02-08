public class Max_Subarray_Sum_Part1{
    //brute force
    public static void maxSubarraySum(int numbers[]){
    int currSum;
    int maxSum = Integer.MIN_VALUE;


    for(int i = 0; i<numbers.length; i++){
        int start = i;
        for(int j = i; j<numbers.length; j++){
            int end = j;
            currSum = 0;
            for(int k = start; k<=end; k++){
                currSum += numbers[k];
                System.out.print(numbers[k]+" ");
            }
            System.out.println();
            // System.out.println("current sum = " + currSum);
            if(maxSum < currSum){
                maxSum = currSum;
            }
        }
    }
    System.out.println("Maximum Sum = " + maxSum);
}
    
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        maxSubarraySum(numbers);
}
}

// Although this approach works but it is not optimized,
// it's time complexity is very bad, so we have next approach call prefix sum