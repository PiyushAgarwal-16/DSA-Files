public class rough6{
    public static void oneZeroTriangle(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i; j++){
                if(((i % 2 == 0) && (j % 2 == 0)) || ((i % 2 != 0) && (j % 2 != 0))){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }

            for(int j = 1; j <= (2*i) - 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = n-1; i>=1; i--){
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }

            for(int j = 1; j <= (2*i) - 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        // oneZeroTriangle(5);
        // solidRhombus(5);
        // hollowRhombus(10);
        diamond(5);
    }
}