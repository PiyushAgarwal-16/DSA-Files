import java.util.Scanner;


// Search_in_Rotated_Sorted_Array with loops
public class try1{
    public static int search(int arr[], int target){
        int si = 0, ei = arr.length-1;

        while(si<=ei){

            int mid = si + (ei-si)/2;
            
            if(target == arr[mid]){
                return mid;
            }
            
            if(arr[si] < arr[mid]){ // mid exists on line 1
                if(target >= arr[si] && target <= arr[mid]){
                    // we have to search in left of line 1
                    ei = mid-1;
                }
                else{
                    si = mid+1;
                }
            }
            else{ // mid exists on line 2
                if(target >= arr[mid] && target <= arr[ei]){
                    si = mid+1;
                }
                else{
                    ei = mid-1;
                }
            }
        }

        return -1;
    }
    public static void main(String args[]){
        int num[] = {4,5,6,7,0,1,2};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        int targetIndex = search(num, target);
        System.out.println("Target lies at: " + targetIndex);  
    }
}