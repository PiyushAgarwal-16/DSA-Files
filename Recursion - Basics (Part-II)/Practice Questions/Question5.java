
import java.util.Scanner;

// Can't solve question 5 on my own

public class Question5{
    public static void towerOfHanoi(int n, String source, String helper, String destination){
        if(n == 1){
            System.out.println("Disk " + n + " transferred from " + source + " to " + destination); 
            return;
        }
        towerOfHanoi(n-1, source, destination, helper); 
        System.out.println("Disk " + n + " transferred from " + source + " to " + destination); 
        // here we are transferring n-1 disks from source(S) to helper(H) tower using destinatinon(D)(as a helper)
        // here destination will be helper(H), so the printed statement will show the same
        // because while doing recursion we passed the H as destination

        towerOfHanoi(n-1, helper, source, destination); 
        // System.out.println("Disk " + n + " transferred from " + source + " to " + destination); 
        // now we are transferring the previous shifted (n-1) disks from helper(H) tower - middle one
        // to the destination(D) tower using source(S) tower as a helper or as a help.

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();
        towerOfHanoi(n, "S", "H", "D");

    }
}