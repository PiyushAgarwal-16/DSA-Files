import java.util.*;

public class Bill{
    public static void main (String args[]) {

        Scanner sc  = new Scanner(System.in);

        float pencil= sc.nextFloat();
        float pen   = sc.nextFloat();
        float eraser= sc.nextFloat();

        float cost  = pencil+pen+eraser;
        float Tax   = 18*cost/100;
        float NetBill  = Tax+cost;

        sc.close();

        System.out.println(NetBill);
    }
}