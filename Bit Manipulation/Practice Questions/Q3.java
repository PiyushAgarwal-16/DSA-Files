public class Q3 {
    public static void main(String[] args) {
        int num = 5;
        int onesComplement = ~num;

        System.out.println("Binary representation of " + num + ": " + Integer.toBinaryString(num));
        System.out.println("Binary One's Complement operation (~" + Integer.toBinaryString(num) + ")");
        System.out.println("Result in binary: " + Integer.toBinaryString(onesComplement));
        System.out.println("Result in decimal: " + onesComplement);
        int result;
        result = (~onesComplement) + 1;
        System.out.println("Final Result: " + result);
    }
}