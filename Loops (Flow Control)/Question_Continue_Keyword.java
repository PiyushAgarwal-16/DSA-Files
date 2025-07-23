// Display all numbers entered by user except multiple of 10 using continue keyword
import java.util.*;

public class Question_Continue_Keyword{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (true){
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue;
            }
            System.out.println(n);
            i++;
        }
    }
}