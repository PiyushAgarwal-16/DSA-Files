// Homework not complete
// will do later

// Update: Completed

public class Max_Subarray_Sum_Part3_Kadane_HW{
    public static boolean check(int numbers[]){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]>0){
                return true;
            }
        }
        return false;
    }

    public static void kadane(int numbers[]) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        if(check(numbers)){
            for(int j = 0; j<numbers.length; j++){
            currsum += numbers[j];
            if(currsum < 0){
                currsum = 0;
            }

            if(maxSum<currsum){
                maxSum = currsum;
            } 
        }
        System.out.println("Max Sum = " + maxSum);
        }
        else {
        for(int i = 0; i<numbers.length; i++){
            if(min < numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println("Max Sum = " + min);
        }
    }
    
    public static void main(String args[]){
        int numbers[] = {-2, -3, -4, -1, -2, -1, -5, -3};
        kadane(numbers);

    }
}
