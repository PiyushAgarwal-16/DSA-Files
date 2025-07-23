// Write a Java program that takes a year from the user and print whether that
// year is a leap year or not.


/*
import java.util.*;

public class Question_5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to check whether it's a leap year or not: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("It's a leap year");
            System.out.println(year);
        }
        
        if (year % 100 == 0) {
            System.out.println("It's a leap year");
            System.out.println(year);
        }
        
        if (year % 400 == 0) {
            System.out.println("It's a leap year");
            System.out.println(year);
        }
        
        else{
            System.out.println("It's not a leap year");
            System.out.println(year);
        }

    }
}
*/

// I couldn't solve this on my own
// I also didn't understand the given solution so i am going to search it online

// I will be understanding this solution from youtube or practice session

// Here is the chatGpt solution:
/*
 * import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}

 */


// Here is Apna College solution:
/*
 * import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
 */