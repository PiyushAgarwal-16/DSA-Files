
public class Reverse_the_given_number{
    public static void main(String args[]){
        // In this program we don't only have to print the reverse
        // but actually reverse the number itself
        // There is formula which will be helping us
        // reverse = (reverse * 10) + lastDigit

        int rev = 0;
        int n = 10899;

        while(n > 0){
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n = n/10;
        }
        System.out.println(rev);
    }
}