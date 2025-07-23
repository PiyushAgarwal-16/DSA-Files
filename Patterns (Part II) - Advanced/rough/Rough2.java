public class Rough2{
    public static void hollow_rectangle(int n){
         // outer loop
         for(int i = 1; i<=n; i++){
            // inner loop - columns
            for(int j = 1;j<=n; j++){
                // cell - (i,j)
                if (i == 1 || i == n || j == 1 || j == n || i==j || (i+j) == n+1){
                    // boundary cells
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
         }
    }
    
    public static void main(String args[]){
        hollow_rectangle(14);
    }
}