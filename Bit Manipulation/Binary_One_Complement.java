/**
 * Demonstrates the binary one's complement operation in Java.
 */
public class Binary_One_Complement {
    public static void main(String[] args) {
        int num = -5;
        int onesComplement = ~num;

        System.out.println("Binary representation of " + num + ": " + Integer.toBinaryString(num));
        System.out.println("Binary One's Complement operation (~" + Integer.toBinaryString(num) + ")");
        System.out.println("Result in binary: " + Integer.toBinaryString(onesComplement));
        System.out.println("Result in decimal: " + onesComplement);
    }
}