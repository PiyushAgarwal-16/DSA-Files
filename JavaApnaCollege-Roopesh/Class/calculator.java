import java.util.*;

public class calculator{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        
        System.out.print("enter a :");
        int a         = sc.nextInt();

        System.out.print("enter b :");
        int b         = sc.nextInt();    

        System.out.print("enter the operator:");
        char operator = sc.next().charAt(0);

        sc.close();

        System.out.print(a+" "+operator+" "+b+" = ");
        
        switch(operator) {

            case '+': System.out.println(a+b);
                      break;

            case '-': System.out.println(a-b);
                      break;

            case '*': System.out.println(a*b);
                      break;

            case '/': System.out.println(a/b);
                      break;

            case '%': System.out.println(a%b);
                      break;

            default: System.out.println("NaN\nI don't think so you have used a valid operator(but if it is then i will add it to my calculator soon, thank you)");
        }
    }
}
