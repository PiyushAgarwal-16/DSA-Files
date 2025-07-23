public class InsertionSort{
    // Correct Approach
    public static void insertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

        // finding out correct position to insert
        while(prev >= 0 && arr[prev] > curr){
            arr[prev + 1] = arr[prev];
            prev--;
        }
        // insertion
        arr[prev+1] = curr; 

        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {4,5,1,3,2};
        insertionSort(arr);
        printArr(arr);
    }
}

    // INCORRECT approach
    // public static void insertionSort(int arr[]){
    //     for(int i = 1; i<arr.length; i++){
    //         int curr = i;
    //         int prev = i-1;
    //         System.out.println(arr[curr]);

    //         // finding out correct position to insert
    //         while(prev >= 0 && arr[prev] > arr[curr]){
    //             arr[prev + 1] = arr[prev];
    //             prev--;
    //         }

    //         // insertion
    //         arr[prev+1] = arr[curr];

    //     }
    // }

    // The problem with the INCORRECT approach is that during the 
    // arr[prev + 1] = arr[prev] shifting the element which was to be stored in 
    // curr variable is lost, as the curr is only holding index

    // but in the CORRECT approach, the curr variable is actually holding the 
    // value it is supposed to