public class rough3{
    public static void kadane(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++){
            cs = cs + arr[i] < 0 ? cs : cs + arr[i]; 
            if(ms<cs){
                ms = cs;
            }
        }
        System.out.println("Max Sum = " + ms);
    }

    public static void kadaneHW(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++){
            cs = cs + arr[i] < 0 ? cs : cs + arr[i]; 
            if(ms<cs){
                ms = cs;
            }
        }
        if (ms == 0){
            int largest = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++){
                largest = largest < arr[i] ? arr[i] : largest;
            }
            System.out.println("Maximum Sum = " + largest);
        }
        else{
            System.out.println("Maximum Sum = " + ms);

        }
    }
    
    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int numbers2[] = {-2, -3, -1, -2, -3};
        kadaneHW(numbers2);
    }
}