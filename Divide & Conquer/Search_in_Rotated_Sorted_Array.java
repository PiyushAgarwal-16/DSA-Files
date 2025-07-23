import java.util.Scanner;

public class Search_in_Rotated_Sorted_Array{

    
    public static int search(int arr[], int si, int ei, int target){
        if(si>ei){
            return -1; // if we reach an invalid case, it means the element doesn't exist
        }
        int mid = si + (ei-si)/2;

        if(target == arr[mid]){
            return mid;
        }
        // Case 1:
        if(arr[si] <= arr[mid]){ // mid exists on line L1
            // Case a:
            if(arr[si] <= target && target <= arr[mid]){ // search in the left part of L1
            return search(arr, si, mid-1, target);
            }

            // Case b:
            else{ // search in the right of Mid
                return search(arr, mid+1, ei, target);
            }
        }
        // Case 2:
        else{ // mid exists on line L2

            // Case c:
            if(target >= arr[mid] && target <= arr[ei]){
                return search(arr, mid+1, ei, target);
            }

            // Case d:
            else{
                return search(arr, si, mid-1, target);
            }
        }
    }
    public static void main(String[] args) {
        int num[] = {4,5,6,7,0,1,2};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        int targetIndex = search(num, 0, num.length-1, target);
        System.out.println("Target lies at: " + targetIndex);    
    }
}