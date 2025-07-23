// Completed Inverted Half-Pyramid with Numbers on my own

public class rough{
    public static void main(String args[]){
        int n = 4;
        
        for (int line = 1; line<=n; line++){
            for (int i = 1; i<=(n-line+1);i++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}