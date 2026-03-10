import java.util.*;

public class Question1{
    public static boolean monotonic(ArrayList<Integer> nums){
        boolean isMonotone = false;
        for(int i = 0; i<nums.size()-1; i++){
            if(nums.get(i) <= nums.get(i+1)){
                isMonotone = true;
            }
            else{
                isMonotone = false;
                break;
            }
        }
        if(isMonotone){
            return true;
        }

        for(int i = 0; i<nums.size()-1; i++){
            if(nums.get(i) >= nums.get(i+1)){
                isMonotone = true;
            }
            else{
                isMonotone = false;
                break;
            }
        }
        return isMonotone;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(2,2,2,2));


        System.out.println(monotonic(nums));
    }
}




// Monotonic ArrayList (EASY)
// An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
// An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An
// Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
// Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
// Sample Input 1 : nums = [1,2,2,3]
// Sample Output 1 : true
// Sample Input 2 : nums = [6,5,4,4]
// Sample Output 2 : true
// Sample Input 3 : nums = [1,3,2]
// Sample Output 3 : false
// Constraints :
// ● 1 <= nums.size() <= 105
// ● -105 <= nums.get(i) <= 105



// Alternate Solution:

// boolean increasing = true;
// boolean decreasing = true;

// for(int i = 0; i < nums.size() - 1; i++){

//     if(nums.get(i) < nums.get(i+1)){
//         decreasing = false;
//     }

//     if(nums.get(i) > nums.get(i+1)){
//         increasing = false;
//     }
// }

// return increasing || decreasing;