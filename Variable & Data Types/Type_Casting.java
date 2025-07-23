public class Type_Casting {
    public static void main(String args[]){
        // Type Casting: Force conversion of the value which java doesn't allow
        float a = 25.12f;
        // int b = a; Will give error
        int b = (int) a;
        System.out.println(b);

        char ch = 'a';
        char ch2 = 'b';
        int number = ch;
        float number2 = ch2;
        System.out.println(number);        
        System.out.println(number2);        

        // Type casting aka Narrowing conversion aka explicit conversion
    }
}