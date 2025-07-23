// Question2: Write a program that reads a set of integers,and then prints the sum of the even and odd integers.
import java.util.*;

public  class Solution_2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sumOdd = 0;
        int sumEven = 0;
        System.out.print("Enter the no. of numbers you want to enter: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Enter a number: ");
            int z = sc.nextInt();
            if(z % 2 == 0){
                sumEven += z;
            } else {
                sumOdd += z;
            }
        }
        System.out.println("Sum of Even numbers: " + sumEven);
        System.out.println("Sum of Odd numbers: " + sumOdd);
    }
}