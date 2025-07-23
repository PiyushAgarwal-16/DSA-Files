import java.util.*;

public class printReverse {
    public static void main(String args[]){

        System.out.print("Enter number:");

        Scanner sc= new Scanner (System.in);

        int i,n=sc.nextInt();

        sc.close();

        for(;n>0;n=n/10){

            i=n%10;

            System.out.print(i);
        }
    

    /*  while(n>0){

            i=n%10;
            n/=10;

            System.out.print(i);
        }
    */
        
    }
}
