import java.util.*;

public class Input_in_Java {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String input = sc.next(); // Captures input till space; i.e. If given input = "Tony Stark", only "Tony will be captured"
        // System.out.println("Hello " + input);
    
        // String name = sc.nextLine(); // Captures everything
        // System.out.println(name);

        // int number = sc.nextInt();
        // System.out.println(number);

        // float price = sc.nextFloat();
        // System.out.println(price);
        
        // boolean choice = sc.nextBoolean();
        // System.out.println(choice);

        short num = sc.nextShort();
        System.out.println(num);

        long num1 = sc.nextLong();
        System.out.println(num1);

    }
}