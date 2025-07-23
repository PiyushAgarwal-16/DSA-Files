public class Quick_Sort{
    public static void printArr(int arr[]) {
        System.out.print("{");
        for(int i = 0; i<arr.length-1; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length-1]);
        System.out.print("}");
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int pIdx = partition(arr, si, ei); // returns pivot index, meaning the index of pivot element with its correct position
        quickSort(arr, si, pIdx-1); // sorting left part
        quickSort(arr, pIdx+1, ei); // sorting right part
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // to make space for elements smaller than pivot

        for(int j = si; j < ei; j++){
            if(arr[j] <= arr[ei]){
                i++;

                // swapping
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        printArr(arr);
        return i; // correct index of the pivot element
    }

public static void main(String args[]) {
    int arr[] = {100, 200, 90, 80, 70, 60, 50}; // Notice the first two elements
    System.out.print("Original array: ");
    printArr(arr);

    quickSort(arr, 0, arr.length-1); // Sort only subarray {90, 80, 70, 60, 50}

    System.out.print("\nAfter sorting subarray: ");
    for (int num : arr) {
        System.out.print(num + " ");
}

}
}