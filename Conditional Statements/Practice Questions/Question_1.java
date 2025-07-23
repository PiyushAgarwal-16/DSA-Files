// Write a Java program to get a number from the user and print whether it is
// positive or negative

import java.util.*;

public class Question_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String type = (number >= 0) ? "Positive":"Negative";
        System.out.println("The number is " + type);
    }
}

// This question's solution was done using if-else conditionals but i used 
// ternary operator, and my code works