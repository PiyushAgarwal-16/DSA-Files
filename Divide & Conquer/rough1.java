public  class rough1{
    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }

        int pivotIndex = partition(arr, si, ei);
        quickSort(arr, si, pivotIndex-1); // for the left part
        quickSort(arr, pivotIndex+1, ei); // for the right part
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j = si; j<ei; j++){
            if(arr[j]<pivot){
                i++;

                // swapping if element is less than pivot
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++; // placing the pivot element at its correct index

        arr[ei] = arr[i];
        arr[i] = pivot;

        return i; // index of pivot element
    }
    public static void main(String[] args) {
        int arr[] = {2,5,3,1,6,4,23,54,21};
        quickSort(arr, 0, arr.length-1);

        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}