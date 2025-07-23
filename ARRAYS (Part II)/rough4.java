public class rough4{
    public static void rainWaterTrapping(int num[]){
        int leftmax[] = new int[num.length];
        int rightmax[] = new int[num.length];
        leftmax[0] = num[0];
        rightmax[rightmax.length-1] = num[num.length-1];
        int trappedwater = 0;

        for(int i = 1; i<num.length; i++){
            leftmax[i] = Math.max(num[i], leftmax[i-1]);
        }

        for(int i = num.length - 2; i >= 0; i--){
            rightmax[i] = Math.max(num[i], rightmax[i+1]);
        }

        for(int i = 0; i<num.length; i++)
        {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel - num[i];
        }
        System.out.println("Trapped Water = " + trappedwater);
    }
    public static void main(String args[]){
        int num[] = {4,2,0,6,3,2,5};
        rainWaterTrapping(num);
    }
}