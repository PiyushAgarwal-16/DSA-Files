public class rough1{
    public static void main(String args[]){
        int num = 2;
        int result = num & 1;
        System.out.println(result > 0 ? "Odd" : "Even");

        int num2 = 110;
        int bitmask = ~(1 << 3);
        System.out.println(Integer.toBinaryString(bitmask));
        // System.out.println(bitmask);
        // System.out.println(~num2);
        System.out.println(num2 & bitmask);
    }
}