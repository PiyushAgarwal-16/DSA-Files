import java.util.*;

public class leapYear{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the year:");

        int year = sc.nextInt(); 

        sc.close();

        if ((year%4==0)&&(year%100!=0)||(year%400==0)) {
            System.out.println("This is a leap year");
        }

        else {
            System.out.println("This is not a leap year");
        }
    }
}