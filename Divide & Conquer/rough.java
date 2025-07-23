public class rough{
    public static int binarySearch(int arr[],int target, int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid = si + (ei-si)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] < target){
            // right part
            return binarySearch(arr, target, mid+1, ei);
        }
        else{
            return binarySearch(arr, target, si, mid-1);
        }
    }
    public static void main(String args[]){
        int num[] = {1,2,3,4,5,6,7};
        int index = binarySearch(num, 7, 0, num.length-1);
        System.out.println(index);
    }
}