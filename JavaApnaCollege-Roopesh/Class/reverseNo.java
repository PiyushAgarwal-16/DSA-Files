import java.util.*;

public class reverseNo{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the no. to reverse:");

        int i= sc.nextInt(),rev=0;

        while(i>0){
           int lastDigit= i%10;
           rev=(rev*10)+lastDigit;
           i/=10;
        }

        System.out.print(rev);

        sc.close();
    }
}