public class SumOfNaturalNumbers{
    public static int sumNaturalNumbers(int n){
        if(n == 1){
            return 1;
        }
        return sumNaturalNumbers(n-1) + n;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumNaturalNumbers(n));
    }
}