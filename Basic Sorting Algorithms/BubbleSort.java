public class BubbleSort{
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int turn = 0; turn <= n; turn++){
            // System.out.println("Turn: " + turn);
            for(int j = 0; j<=(n-2-turn); j++){
            // System.out.println("j: " + j);
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        } // Was able to create the code by myself after learning the logic
        // and getting the loops' code

        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } // I just wrote this so i can copy paste it in other files


    public static void main(String args[]){
        int arr[] = {4,5,2,1,3};
        bubbleSort(arr);
    }
}