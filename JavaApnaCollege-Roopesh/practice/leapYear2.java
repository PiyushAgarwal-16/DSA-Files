import java.util.*;

public class leapYear2{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.println("enter year:");

        int year= sc.nextInt();
        
        if(year%4!=0) {
            System.out.print("this is not a leap year");
        }

        else {
            if(year%100!=0){
                System.out.print("this is a leap year");
            }

            else{
                if(year%400==0){
                    System.out.print("this is a leap year");
                }
                else {
                    System.out.print("this is not a leap year");
                }

            }

        }
        sc.close();

    }
}