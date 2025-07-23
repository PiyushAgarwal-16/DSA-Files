public class rough{
    public static int trappedRainWater(int height[]){
        int n = height.length;
        // we will first calculate left max boundary
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1; i < n; i++){
            // leftmax[i] = Math.max(leftmax[i-1], height[i]);
            if(height[i] > leftmax[i-1]){
                leftmax[i] = height[i];
            } else{
                leftmax[i] = leftmax[i-1];
            }
        }

        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            // rightmax[i] = Math.max(rightmax[i+1], height[i]);
            if(height[i] > rightmax[i+1]){
                rightmax[i] = height[i];
            } else{
                rightmax[i] = rightmax[i+1];
            }
        }

        int trappedwater = 0;

        for(int i = 0; i < n; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }

    public static void main(String args[]){
        int height[] = {8,4,2,0,6,3,2,5,10};
        System.out.println(trappedRainWater(height));

    }
}