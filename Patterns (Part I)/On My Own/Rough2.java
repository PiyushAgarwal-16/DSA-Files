public class Rough2{
    public static void main(String args[]){
        /**
         * Pattern to print:
         * A
         * BC
         * DEF
         * GHIJ
         */
        
        int n = 4;
        char ch = 'A';

        for (int line = 1; line <=n; line++){
            for(int chars = 1; chars <= line; chars++){
                System.out.print(ch);
                ch++;
            }
            ch = 'A';
            System.out.println();
        }
    }
}