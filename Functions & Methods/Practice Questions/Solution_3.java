// Question 3 : Write a Java program to check if a number is a palindrome in Java?(121 is a
// palindrome, 321 is not)
// A number is called a palindrome if the number is equal to the reverse of a number e.g.,121 is a
// palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321

// I will be using the reverse function i learned in the course

public class Solution_3{

    public static int reverse(int n){
        int rev = 0;

        while(n > 0){
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n = n/10;
        }
        return rev;
    }

    public static boolean palindrome(int n){
        return n == reverse(n);
    }
    public static void main(String[] args) {
        System.out.println(palindrome(36363));
    }
}