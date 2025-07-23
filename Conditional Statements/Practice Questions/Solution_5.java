import java.util.*;

public class Solution_5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        boolean x = (year % 4 == 0);
        boolean y = (year % 100 != 0);
        boolean z = (year % 100 == 0 && year % 400 == 0); // Here even if we remove
        // the year % 100 == 0 condition it should still work the same as
        // every number which is divisible by 400 would automatically be also
        // divisible by 100 as well

        if (x && (y || z)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}