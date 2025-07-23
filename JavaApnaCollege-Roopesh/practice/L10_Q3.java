//code to input week number and output week day

import java.util.*;

public class L10_Q3 {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number from 1-7 :");

        int i=sc.nextInt();

        sc.close();

        switch(i){
                
        case 1: System.out.print("Monday");
                break;
        
        case 2: System.out.print("Tuesday");
                break;

        case 3: System.out.print("Wednesday");
                break;

        case 4: System.out.print("Thursday");
                break;
        
        case 5: System.out.print("Friday");
                break;

        case 6: System.out.print("Saturday");
                break;

        case 7: System.out.print("Sunday");
                break; 
        }           
    }
}