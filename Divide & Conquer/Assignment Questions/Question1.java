public class Question1{
    public static void mergeSortString(String arr[], int si, int ei){
        if(si>=ei){
            return;
        }

        int mid = si + (ei-si)/2;
        mergeSortString(arr, si, mid); // left part
        mergeSortString(arr, mid+1, ei); // right part
        merge(arr, si, ei, mid);
    }
    public static void merge(String arr[], int si, int ei, int mid){
        String temp[] = new String[ei-si+1];
        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0; // iterator for temp

        while(i<=mid && j <= ei){
            if(arr[j].compareTo(arr[i]) >= 0){
                temp[k] = arr[i];
                k++; i++;
            }
            else{
                temp[k] = arr[j];
                k++; j++;
            }
        }

        // if right part is exhausted
        while(i <= mid){
            temp[k] = arr[i];
            i++; k++;
        }

        // if left part is exhausted
        while(j<=ei){
            temp[k] = arr[j];
            j++; k++;
        }


        // copying back items from temp to original array
        for(k = 0, i = si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury"};
        mergeSortString(arr, 0, arr.length-1);

        for(String str: arr){
            System.out.print(str + " ");
        }
    }
}