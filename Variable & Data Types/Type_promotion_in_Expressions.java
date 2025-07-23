public class Type_promotion_in_Expressions {
    public static void main(String args[]){
        /*
        1. Java automatically promotes each byte, short or char operand to int while 
        evaluating an EXPRESSION (like +, -, *, /, etc.).

        2. If one operand is long, float, or double the whole expression is promoted
        to long, float, or double respectively. 
        -> i.e. if largest datatype in expression is
        long then all the other datatypes will be promoted to long as well
        -> Similarly, if the largest datatype in an expression is double then all the other 
        datatype will be converted into double as well.
         */

        char a = 'a';
        char b = 'b';
        // char c = a - b; Will give error
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(a);
        System.out.println(b-a);


        short a1 = 5;
        byte b1 = 25;
        char c = 'c';
        // byte bt = a + b + c; will give error because system converted (a, b, c) into int
        byte bt = (byte) (a1 + b1 + c);
        System.out.println(bt);
        
        int a2 = 10;
        float b2 = 20.25f;
        long c2 = 25;
        double d = 30;
        // int ans = a2 + b2 + c2 + d; will give error, as everything is converted into double
        int ans = a2 + b2 + c2 + d;
        System.out.println(ans);
    }
}