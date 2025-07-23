public class rough{
    public static int[] reverse(int num[], int num2[]) {
        for(int i = num.length-1; i>=0; i--){
            num2[num.length-1-i] = num[i];
        }
        return num2;
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int num2[] = new int[numbers.length];
        reverse(numbers, num2);

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        for(int i = 0; i < num2.length; i++){
            System.out.print(num2[i]+ " ");
        }

    }
}