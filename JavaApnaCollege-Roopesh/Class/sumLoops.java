import java.util.*;

public class sumLoops{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Sum till:");

        int n= sc.nextInt();

        sc.close();

        int i=1, sum=0 ;

        while(i<=n){
            sum+=i;
            i++;
        }

        System.out.println(sum);

    }
}