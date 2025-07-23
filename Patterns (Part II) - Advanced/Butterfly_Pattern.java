public class Butterfly_Pattern{
    public static void Butterfly_Pattern(int n){
        // 1st Half
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            for(int j = 1; j<=(2*(n-i));j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // to create mirror image of any pattern just, reverse the outer loop
        // from n to 1
        
        // 2nd Half
        for (int i = n; i>=1; i--){
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            for(int j = 1; j<=(2*(n-i));j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Butterfly_Pattern(5);
    }
}