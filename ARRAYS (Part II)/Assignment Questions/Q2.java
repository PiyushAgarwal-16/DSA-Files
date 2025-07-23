
// Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1  <=  k  <  nums.length)
// such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.
// You must write an algorithm with O(log n) runtime complexity

// I did this question by linear search, but this needs to be more optimized
// so it's correct solution will be with binary search, although to solve the most part
// my solution is correct, but the time complexity needs to be more optimized as per the question
// Also this is a leetcode medium level question


// public class Q2{
//     public static int indexing(int nums[], int target) {
//         for(int i = 0; i<nums.length; i++){
//             if(nums[i] == target){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]){
//         int nums[] = {4,5,6,7,0,1,2};
//         int target = 0;
//         System.out.println(indexing(nums, target));
//     }
// }