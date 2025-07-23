public class Type_Conversion {
    public static void main(String args[]){
        // int a = 25;
        // long b = a;

        long a = 25;
        int b = a; // Will give error
        System.out.println(b);
    
        /* Type conversion is possible when:
           a. type compatible
           b. destination type > source type

           byte -> short -> int -> float -> long -> double
        
           Type Conversion aka Widening Conversion aka Implicit Conversion
        */
    }
}