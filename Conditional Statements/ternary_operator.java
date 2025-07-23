public class ternary_operator {
    public static void main(String args[]){
        /* Syntax
         * Variable = condition? statement 1 : statement 2
         * if condition is true, the statement 1 will be executed 
         * and if condition is false, the statement 2 will be executed
         * 
         * The question mark (?) is the ternary operator
         * and the colon (:) can be interpretered as nahi toh
         */

        int number = 5;

        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
