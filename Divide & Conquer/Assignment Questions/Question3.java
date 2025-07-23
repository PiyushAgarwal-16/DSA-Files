public class Question3{
    public static int inversionCount(int arr[]){
        int inversion = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    inversion++;
                }
            }
        }

        return inversion;
    }

    public static int mergeSortInversion(int arr[], int si, int ei){
        if(si<ei){
            int mid = si + (ei-si)/2;

            int leftInvCount = mergeSortInversion(arr, si, mid);
            int rightInvCount = mergeSortInversion(arr, mid+1, ei);
            int invCount = merge(arr, si, ei, mid);

            int totalInvCount = leftInvCount + rightInvCount + invCount;
            return totalInvCount;
        }
        return 0;
    }

    public static int merge(int arr[], int si, int ei, int mid){
        int temp[] = new int[ei-si+1];
        int k = 0; // iterator for temp array
        int i = si;
        int j = mid+1;

        int invCount = 0;

        while(i<=mid && j<=ei){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++; k++;
            }
            else{
                invCount += (mid-i+1);
                temp[k] = arr[j];
                j++; k++;
            }
        }


        // when right part is exhausted
        while(i <= mid){
            temp[k] = arr[i];
            i++; k++;
        }

        while(j <= ei){
            temp[k] = arr[j];
            j++; k++;
        }


        for(k = 0, i = si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }

        return invCount;
    }


    public static void main(String[] args) {
        int arr[] = {9, 99, 99, 55, 99, 99, 6, 99, 31, 99, 100, 99, 66, 99, 30};
        System.out.println("Inversion Count(Brute Force): " + inversionCount(arr));
        System.out.println("Inversion Count(Optimized): " + mergeSortInversion(arr, 0, arr.length-1));
    }
}

// This was stated as hard level question, but i am able to create it's brute force approach
// Now i will see the optimized solution