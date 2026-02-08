
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


public class Q2{
    public static int indexing(int nums[], int target){ // time complexity : O(n)
        int pivot = 0;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                pivot = i+1;
            }
        }
        
        if(target == nums[pivot]){
            return pivot;
        }


        int si = 0;
        int ei = pivot-1;
        int si2 = pivot;
        int ei2 = nums.length-1;

        while(si <= ei){
            int mid = (si+ei)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
        }

        while(si2 <= ei2){
            int mid = (si2+ei2)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                ei2 = mid-1;
            }
            else{
                si2 = mid + 1;
            }
        }
        return -1;
    }


    public static int search(int arr[], int target){//correct approach for O(log n) time complexity
        int si = 0;
        int ei = arr.length-1;
        while(si <= ei){
            int mid = (si+ei)/2;

            if(target == arr[mid]) return mid;

            if(arr[si] <= arr[mid]){
                if(target >= arr[si] && target < arr[mid]){
                    ei = mid-1;
                }
                else{
                    si = mid+1;
                }
            }
            else{
                if(target > arr[mid] && target <= arr[ei]){
                    si = mid+1;
                }
                else{
                    ei = mid-1;
                }
            }
        }
        return -1;
    }



    public static void main(String args[]){
        int nums[] = {7,0,1,2,3,4,5,6};
        int target = 7;
        System.out.println(search(nums, target));
    }
}


