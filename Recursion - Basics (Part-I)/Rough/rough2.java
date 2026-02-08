public class rough2{
    public static void decreasing(int n){
        if(n == -101){
            return;
        }
        System.out.println(n);
        decreasing(n-1);
    }

    public static void main(String args[]){
        decreasing(10);
    }
}