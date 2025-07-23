public class rough2{
    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid); // left part
        mergeSort(arr,mid+1, ei); // right part
        merge(arr,si,ei, mid);
    }
    public static void merge(int arr[], int si, int ei, int mid){
        int temp[] = new int[ei-si+1];
        int i = 0; // iterator for temp
        int j = si;
        int k = mid+1;
        
        while(j<=mid && k<=ei){
            if(arr[j] < arr[k]){
                temp[i] = arr[j];
                j++;
            }
            else{
                temp[i] = arr[k];
                k++;
            }
            i++;
        }

        // if left part is exhausted
        while(k<=ei){
            temp[i] = arr[k];
            i++; k++;
        }

        // if right part is exhausted

        while(j<=mid){
            temp[i] = arr[j];
            j++; k++;
        }


        // copying elements from temp to the original array

        for(i = 0, j = si; i<temp.length; i++, j++){
            arr[j] = temp[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,3,1,6,4,23,54,21};
        mergeSort(arr, 0, arr.length-1);

        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}