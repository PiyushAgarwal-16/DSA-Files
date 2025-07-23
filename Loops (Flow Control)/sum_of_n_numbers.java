import java.util.*;

public class sum_of_n_numbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= n){
            sum += i;
            i++;
        }
        System.out.println("Sum of first " + n + " natural numbers is " + sum);
    }
}