public class SelectionSort{
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for(int i = 0; i<=n-2; i++){
            int minPos = i; // storing indices here
            for(int j = i+1; j <= n-1; j++){
                if(arr[j]<arr[minPos]){ // comparing elements here
                minPos = j; 
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4,5,1,3,2};
        selectionSort(arr);
        printArr(arr);
    }
}