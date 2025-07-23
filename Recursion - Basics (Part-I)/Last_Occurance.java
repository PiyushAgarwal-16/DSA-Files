public class Last_Occurance{
    public static int lastOcc(int arr[], int key, int i){
        if(arr[i] == key){
            return i;
        }
        if(i == 0){
            return -1;
        }
        return lastOcc(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[] = {3,4,2,4,9,5,8,4,3,5};
        System.out.println(lastOcc(arr, 3, arr.length-1)); 
    }
}