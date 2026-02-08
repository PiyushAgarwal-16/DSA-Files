public class rough3{
    public static void insertionSort(int arr[]){
        int n = arr.length;
        int current;
        for(int i = 1; i < n; i++){
            int j = i;
            if(arr[i] < arr[i-1]){
                current = arr[i];
                while(j > 0 && current < arr[j-1]){
                    arr[j] = arr[j-1];
                    j--;
                }
                arr[j] = current;
            }
        }
    }

    public static void pushing(int arr[]){
        int i = arr.length-1;
        while(i>0){
            arr[i] = arr[i-1];
            i--;
        }
    }

    public static void main(String[] args) {
        int num[] = {4,5,1,3,2};
        insertionSort(num);
        for(int i = 0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
}