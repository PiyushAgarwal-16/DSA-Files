public class Clear_Ith_Bit{
    public static int ClearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.println(ClearIthBit(10,1));
        System.out.println(ClearIthBit(15,2));
    }
}