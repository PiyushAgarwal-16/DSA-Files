/**
 * Demonstrates the binary left shift operator in Java.
 * Left shifting a number by n positions is equivalent to multiplying by 2^n.
 */
public class Binary_Right_Shift {
    public static void main(String[] args) {
        int num1 = 6;
        int shiftAmount = 1;
        int result = num1 >> shiftAmount;
        
        System.out.println("Binary representation of " + num1 + ": " + Integer.toBinaryString(num1));
        System.out.println("Binary Right shift by " + shiftAmount + ", operation: " + Integer.toBinaryString(num1) + " >> " + shiftAmount);
        System.out.println("Result in binary: " + Integer.toBinaryString(result));
        System.out.println("Result in decimal: " + result);
        System.out.println("Note: Right shifting by " + shiftAmount + " is equivalent to dividing by " + (1 << shiftAmount) + " (2^" + shiftAmount + ")");
    }
}