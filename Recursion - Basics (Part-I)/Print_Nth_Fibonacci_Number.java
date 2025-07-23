public class Print_Nth_Fibonacci_Number{
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        int fibnm1 = fibonacci(n-1);
        int fibnm2 = fibonacci(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
    public static void main(String args[]){
        System.out.println(fibonacci(7));
    }
}