public class rough_experiment{
    public static int firstOccurance(int arr[], int key, int i){
        if(arr[i] == key){
            return i;
        }
        if(i == arr.length-1){
            return -1;
        }
        if(firstOccurance(arr, key, i+1) == 4){
            return -2;
        }
        return firstOccurance(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[] = {3,4,2,4,9,8,4,3,5};
        System.out.println(firstOccurance(arr, 9, 0));
    }
}
