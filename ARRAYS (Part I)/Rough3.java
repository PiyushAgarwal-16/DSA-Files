public class Rough3{
    public static void Pattern(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(i == n || (i+j) == n+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i = n; i>=1; i--){
            for(int j = 1; j<=n; j++){
                if(i == n || (i+j) == n+1){
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
        Pattern(5);
    }
}