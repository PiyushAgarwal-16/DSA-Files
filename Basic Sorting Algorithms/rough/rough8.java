public class rough8{
    public static void countingSort(int arr[]){
        int n = arr.length;
        int range = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i] > range){
                range = arr[i];
            }
        }
        // range++;
        int temp[] = new int[range+1];
        for(int i = 0; i<n; i++){
            temp[arr[i]]++;
        }


        for(int i = 0; i<range+1; i++){
            System.out.print(temp[i] + " ");
        }

    }
    public static void main(String[] args) {
        int num[] = {1,4,1,3,2,4,3,7};
        countingSort(num);
    }
}