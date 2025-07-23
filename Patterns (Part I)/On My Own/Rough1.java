public class Rough1{
    public static void main(String args[]){
        int n = 4;
        char ch = 'A';

        for (int line = 1; line<=n; line++){
            for (int chars = 1; chars <= (n-line+1); chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}