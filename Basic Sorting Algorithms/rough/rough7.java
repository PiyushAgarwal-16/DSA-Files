public class rough7{
    public static void countingSort(int arr[]){
        int n = arr.length;
        int range = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            if(arr[i] > range){
                range = arr[i];
            }
            // Alternatively: 
            // range = Math.max(range, arr[i]);
        }

        int temp[] = new int[range+1];
        for(int i = 0; i<n; i++){
            temp[arr[i]]++;
        }

        int j = 0;
        for(int i = 0; i<temp.length; i++){
            while(temp[i] > 0){
                arr[j] = i;
                temp[i]--;
                j++;
            }
        }
        for(int k = 0;k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }

    }


    
    public static void main(String[] args) {
        int num[] = {1,4,1,3,2,4,3,7};
        countingSort(num);
    }
}