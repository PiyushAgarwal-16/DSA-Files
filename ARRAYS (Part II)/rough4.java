

public class rough4{
    public static int rainWaterTrapping(int arr[]){
        int n = arr.length;
        int trappedWater = 0;

        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        for(int i = 1; i<n; i++){
            leftmax[i] = Math.max(leftmax[i-1], arr[i]);
            System.out.print(leftmax[i] + " ");
        }
        System.out.println();


        int rightmax[] = new int[n];
        rightmax[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1], arr[i]);
        }

        for(int i = 0; i<n; i++){
            int height = Math.min(leftmax[i], rightmax[i]);
            trappedWater += (height - arr[i]);
        }
        return trappedWater;
    }

    public static void main(String args[]){
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(rainWaterTrapping(arr));
    }   
}