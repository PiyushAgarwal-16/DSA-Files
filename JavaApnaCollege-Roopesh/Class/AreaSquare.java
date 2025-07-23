import java.util.*;

public class AreaSquare{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        int side  = sc.nextInt();

        int Area  = side*side;

        sc.close();

        System.out.println("area of square is:"+Area);
    }
}