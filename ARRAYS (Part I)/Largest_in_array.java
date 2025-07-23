
public class Largest_in_array{
    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE; // Negative infinity
        int smallest = Integer.MAX_VALUE; // Positive infinity

        for(int i = 0; i<num.length;i++){
            if(largest < num[i]){
                largest = num[i];
            }
            if(smallest > num[i]){
                smallest = num[i];
            }
        }
        System.out.println("Smallest value is: " + smallest);
        return largest;
    }

    public static void main(String args[]){
        int numbers[] = {0,1,2,6,4,5};
        System.out.println("largest value is: " + getLargest(numbers));
    }
}


