public class Update_Ith_Bit{

    public static int SetIthBit(int n, int i){
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int ClearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int UpdateIthBit(int n, int i, int newbit){
        if(newbit == 0){
            return ClearIthBit(n, i);
        }
        else{
            return SetIthBit(n, i);
        }

        // Another approach:
        // n = ClearIthBit(n, i);
        // int bitmask = newbit << i;
        // return n | bitmask;
    }
    public static void main(String args[]){

    }
}