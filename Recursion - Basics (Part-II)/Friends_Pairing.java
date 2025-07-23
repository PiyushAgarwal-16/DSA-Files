public class Friends_Pairing{
    public static int friends(int n){
        if(n == 1 || n == 2){
            return n;
        }
        int fnm1 = friends(n-1);
        int fnm2 = friends(n-2);
        int pairWays = (n-1) * fnm2;
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(friends(5));
    }
}