public class rough6{
    public static void selectionSort(int arr[]){
        int n = arr.length;
        int smallest = Integer.MAX_VALUE;
        int smallPos = 0;
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                if(arr[j] < smallest){
                    smallest = arr[j];
                    smallPos = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[smallPos];
            arr[smallPos] = temp;
            smallest = Integer.MAX_VALUE;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int num[] = {4,5,1,3,2};
        selectionSort(num);
    }
}