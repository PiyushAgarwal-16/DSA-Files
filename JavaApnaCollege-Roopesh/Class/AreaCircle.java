import java.util.*;

public class AreaCircle{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        int radius= sc.nextInt();
        
        float pi= 3.14f;
        float Area= pi*radius*radius;
        
        System.out.println("Area of Circle is :"+Area);

        sc.close();

    }
}                   