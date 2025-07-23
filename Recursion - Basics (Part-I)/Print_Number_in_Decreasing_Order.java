public class Print_Number_in_Decreasing_Order{
    public static void printDec(int n){
        if(n == 1){
            System.out.println(1);
            return; // get out the function, so that function won't recurse infinitely
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void main(String args[]){
        int n = 10;
        printDec(n);
    }
}