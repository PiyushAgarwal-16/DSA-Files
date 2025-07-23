public class rough3{
    public static void main(String args[]){
        int arr[] = {2,3,2,4,5,2,6,2,7};
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int number: arr){
            System.out.print(number + " ");
        }
    }
}