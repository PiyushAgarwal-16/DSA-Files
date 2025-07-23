import java.util.*;

public class if_number_is_odd_or_even {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("EVEN");
        } else{
            System.out.println("ODD");
        }
    }
}