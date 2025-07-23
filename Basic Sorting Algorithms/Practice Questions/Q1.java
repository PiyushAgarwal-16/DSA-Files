public class Q1{
    public static void bubbleSort(int arr[]){
        for(int i = 0; i <= arr.length; i++){
            for(int j = 0; j <= arr.length - 2; j++){ 
                // here one thing i forgot is arr.length - 2 - i;
                // but my solution works as well
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int minpos = i;
            for(int j = i; j<arr.length;j++){
                if(arr[j]<arr[minpos]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;

        }
        
        // couldn't do it in first time by myself
        }


    public static void insertionSort(int arr[]){
        for(int i = 1; i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev]>curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for(int i = 0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i = 0; i<count.length; i++){ // Couldn't add all the elements back into arr properly on my own
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        countingSort(arr);
        printArr(arr);
    }
}