public class Inverted_star_pattern{
    public static void main(String args[]){
        /**
         **** Line = 1, Stars = 4
         ***  Line = 2, Stars = 3
         **   Line = 3, Stars = 2
         *    Line = 4, Stars = 1
         - Pattern  to print
        In this the stars are decreasing with the same no. lines are increasing
         */
        int n = 10;
        for(int line = 1; line <= n; line++){
            for(int star = 1; star <= (n - line + 1); star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}