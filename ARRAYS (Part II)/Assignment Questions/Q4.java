// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
// Rain water trapping

public class Q4{
    public static void rainWater(int height[]){
        int n = height.length;
        int leftmax[] = new int[n]; 
        leftmax[0] = height[0];

        for(int i = 1; i<n; i++){
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }
        int rightmax[] = new int[n]; 
        rightmax[n-1] = height[n-1];

        for(int i = n-2; i >= 0; i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }

        int waterlevel[] = new int[n];
        for(int i = 0; i<n; i++){
            waterlevel[i] = Math.min(leftmax[i],rightmax[i]);
        }
        int trappedwater = 0;

        for(int i = 0; i<n; i++){
            trappedwater += waterlevel[i] - height[i];
        }
        System.out.println(trappedwater);
    }

    public static void main(String args[]){
        int height[] = {4,2,0,3,2,5};
        rainWater(height);
    }
}
