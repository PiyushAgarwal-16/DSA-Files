
public class Print_reverse_of_a_number{
    public static void main(String[] args) {
        /**
         * If you want to get:
         * Last digit of any number: number % 10
         * And if you want to remove last digit: number / 10
         */
        int n = 45325423;

        while (n>0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n /= 10;
        }
    }
}