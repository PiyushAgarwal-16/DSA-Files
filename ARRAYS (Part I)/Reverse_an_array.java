public class Reverse_an_array{
    public static void reverse(int num[]) {
        int first = 0, last = num.length - 1;
            
        while (first<last){
            // swap
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;

            // we are swapping first and last element of the array
            // and then closing in towards center
        }
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        reverse(numbers);

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }

    }
}