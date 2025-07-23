public class First_Occurance{
    public static int firstOccurance(int arr[], int key, int i){
        if(arr[i] == key){
            return i;
        }
        if(i == arr.length-1){
            return -1;
        }
        return firstOccurance(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[] = {3,4,2,4,9,8,4,3,5};
        System.out.println(firstOccurance(arr, 5, 0));
    }
}
