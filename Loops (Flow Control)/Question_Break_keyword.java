// Keep entering numbers till users enter a multiple of 10 using break keyword
import java.util.*;

public class Question_Break_keyword{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.print("Enter your number: ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        } while (true);
    }
}