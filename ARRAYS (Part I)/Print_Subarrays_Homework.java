
public class Print_Subarrays_Homework{
        public static void printSubarrays(int numbers[]){
        int ts = 0; // total subarrays
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                int sum = 0;
                for(int k = start; k<=end; k++){
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }
                System.out.println();
                System.out.println("sum = " + sum);
                if (sum > largest){
                    largest = sum;
                }
                if (sum < smallest){
                    smallest = sum;
                }
                ts++;
            }
            System.out.println();
        }
        System.out.println("largest subarray sum = " + largest);
        System.out.println("smallest subarray sum = " + smallest);
        System.out.println("total subarrays = " + ts);
    }
    
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}

// I was able to print sum of all the subarrays but i couldn't print the minimum and maximum sum

// Now i was able to solve the maximum and minimum subarrays sub problem

// Although I have solved it for the all the subarrays, but it can be solved for individual 
// elements' subarrays as well, like: 
// the maximum and minimum subarray sum from subarrays that start with first element (2 here)