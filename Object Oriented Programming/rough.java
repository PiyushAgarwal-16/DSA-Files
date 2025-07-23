import java.util.Arrays;
class rough {
    public static int removeDuplicates(int[] nums) {
        // int num[] = {1,2,3,4,4,5,5};
        int num2[] = new int[nums.length];
        int index = 1;
        // System.out.println(nums[0]);
        num2[0] = nums[0];
        int k = 1;
        for(int j = 1; j<nums.length-1; j++){
            if(nums[j] != nums[j+1]){
                num2[index] = nums[j+1];
                // System.out.println(nums[j+1]);
                index++;
                k++;
            }
        }
        for(int i = 0; i<num2.length; i++){
            System.out.print(num2[i] + " ");
        }
        return k;
    }
    public static void main(String args[]){
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        int num[] = {2,2,1,-1,-1};
        Arrays.sort(num);
        for(int i = 0; i< num.length; i++){
            System.out.print(num[i] + " ");
        }
        // removeDuplicates(nums);
    }
}


