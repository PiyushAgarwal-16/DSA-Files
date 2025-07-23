public class Binary_XOR{
    public static void main(String args[]) {
        int num1 = 5;
        int num2 = 6;
        int result = num1 ^ num2;
        
        System.out.println("Binary representation of " + num1 + ": " + Integer.toBinaryString(num1));
        System.out.println("Binary representation of " + num2 + ": " + Integer.toBinaryString(num2));
        System.out.println("Binary XOR operation: " + Integer.toBinaryString(num1) + " ^ " + Integer.toBinaryString(num2));
        System.out.println("Result in binary: " + Integer.toBinaryString(result));
        System.out.println("Result in decimal: " + result);
    }
}