public class rough1{
    public static int firstOccurance(int arr[], int key, int i, int count){
        if(arr[i] == key){
            count++;
            // return i;
        }
        if(count == 2){ //nth occurance, 2nd occurance here; will return index of 2nd occurance
            return i;
        }

        if(i == arr.length-1){
            return -1;
        }
        return firstOccurance(arr, key, i+1, count);
    }
    public static void main(String args[]){
        int arr[] = {3,4,2,4,3,9,8,3,4,3,5};
        System.out.println(firstOccurance(arr, 3, 0, 0));
    }
}
