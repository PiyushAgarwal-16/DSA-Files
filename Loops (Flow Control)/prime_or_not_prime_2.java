import java.util.*;

// Math.sqrt(n) is the only difference between program 1 and 2,
// this is more optimized as it will go through less iteration for determining
// whether a number is prime or not

public class prime_or_not_prime_2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n == 2){
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){ // n is multiple of i (i is not equal to 1 or n)
                isPrime = false;
            }
            }
            if (isPrime == true){
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }
        
    }
}