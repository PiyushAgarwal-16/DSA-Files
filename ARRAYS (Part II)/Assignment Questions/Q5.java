// Question 5:Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets.Example 1:Input:nums = [-1, 0,  1, 2, -1, -4]   Output:   [ [-1, -1, 2] , [-1, 0, 1] ]
// Example 2:Input:nums = [ ]  Output:   [ ]  Example 3:Input:nums = [ 0 ]  Output: [ ] 


// I am able to write logic for this question, but put the outputs in a array

// For sorting the triplets they have used some new concepts which i am unfamiliar with
// but all in all my solution was right
public class Q5{
    public static void triplets(int nums[]){
        int n = nums.length;
        for(int i = 0; i < n-2;i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    if(i != j && i != k && j != k && (nums[i] + nums[j] + nums[k]) == 0){
                    System.out.println("[" + nums[i] + "," + nums[j] + "," + nums[k] + "]");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {0};
        triplets(nums);
    }
}