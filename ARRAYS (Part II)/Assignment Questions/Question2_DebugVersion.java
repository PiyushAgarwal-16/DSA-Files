public class Question2_DebugVersion {
    public static int search(int arr[], int target) {
        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {
            int mid = (si + ei) / 2;

            // Debug print
            System.out.println("si=" + si + " ei=" + ei + " mid=" + mid + 
                               " arr[mid]=" + arr[mid]);

            if (arr[mid] == target) {
                System.out.println("Found target at index " + mid);
                return mid;
            }

            // Left half is sorted
            if (arr[si] <= arr[mid]) {
                if (target >= arr[si] && target < arr[mid]) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (target > arr[mid] && target <= arr[ei]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }
        System.out.println("Target not found");
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {7,0,1,2,4,5,6};
        int target = 7;
        System.out.println("Result: " + search(nums, target));
    }
}
