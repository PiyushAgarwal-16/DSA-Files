import java.util.*;

public class Question2{
    public static void lonely(ArrayList<Integer> nums){
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i<nums.size(); i++){
            boolean isLonely = true;
            for(int j = 0; j<nums.size(); j++){
                if(j == i) continue;
                if(nums.get(i).equals(nums.get(j)) || nums.get(i) == nums.get(j) + 1 || nums.get(i) == nums.get(j) - 1){
                    isLonely = false;
                }
            }
            if(isLonely){
                result.add(nums.get(i));
            }
        }

        System.out.println(result);
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(1,3,5,3));
        lonely(nums);
    }
}

// Lonely Numbers in ArrayList (MEDIUM)
// You are given an integer arraylist nums. A number x is lonely when it appears only once, and
// no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
// Return all lonely numbers in nums. You may return the answer in any order.
// Sample Input 1 : nums = [10,6,5,8]
// Sample Output 1 : [10,8]
// Explanation :
// - 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
// - 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums. piyushagarwal583@gmail.com
// - 5 is not a lonely number since 6 appears in nums and vice versa.
// Hence, the lonely numbers in nums are [10, 8].
// Note that [8, 10] may also be returned.
// Sample Input 2 : nums = [1,3,5,3]
// Sample Output 2 : [1,5]
// Explanation :
// - 1 is a lonely number since it appears exactly once and 0 and 2 does not appear in nums.
// - 5 is a lonely number since it appears exactly once and 4 and 6 does not appear in nums.
// - 3 is not a lonely number since it appears twice.
// Hence, the lonely numbers in nums are [1, 5].
// Note that [5, 1] may also be returned.
// Constraints :
// ● 1 <= nums.size() <= 105
// ● 0 <= nums.get(i) <= 106