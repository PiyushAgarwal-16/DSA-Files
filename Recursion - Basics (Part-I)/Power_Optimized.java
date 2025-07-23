public class Power_Optimized{
    public static int powerOptimized(int x, int n){ // still time complexity:
    // O(n)
        if(n == 0){
            return 1;
        }        
        
        // for even power:
        int halfpowersq = powerOptimized(x, n/2) * powerOptimized(x, n/2);

        // for odd power:
        if(n % 2 != 0){
            halfpowersq = x * halfpowersq;
        }
        return halfpowersq;
    }

    public static int powerOptimized1(int x, int n){
        // now time complexity: O(log n)
        if(n == 0){
            return 1;
        }        
        int halfpower = powerOptimized1(x, n/2);
        // for even power:
        int halfpowersq =  halfpower * halfpower;

        // for odd power:
        if(n % 2 != 0){
            halfpowersq = x * halfpowersq;
        }
        return halfpowersq;
    }


    public static void main(String[] args) {
        System.out.println(1/2);
    }
}