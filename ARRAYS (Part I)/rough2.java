public class rough2{
    public static void Print_Subarrays(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<num.length;i++){
            for(int j = i; j < num.length; j++){
                int sum = 0;
                for(int k = i; k<=j; k++){
                    System.out.print(num[k] + " ");
                    sum += num[k];
                }
                System.out.println();
                System.out.println("Sum = " + sum);
                if (sum > largest){
                    largest = sum;
                }

            }
        }
        System.out.println("Largest Sum = " + largest);
    }

    public static void main(String args[]){
        int num[] = {2,3,4,5,6,7};
        // int sums[] = new int[(num.length * (num.length + 1))/2];
        Print_Subarrays(num);
    }
}