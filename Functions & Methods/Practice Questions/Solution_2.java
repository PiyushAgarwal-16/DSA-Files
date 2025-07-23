// Question 2 : Write a method named is Even that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test your
// method.

public class Solution_2 {
    public static boolean Even(int n){
        if (n % 2==0) {
            return true;
        } 
        else{
            return false;

        // Another more simple approach:
        // return (n % 2 == 0);
        }
    }

    public static void main(String args[]){
        System.out.println(Even(2));
        System.out.println(Even(3));
    }
}