public class Hollow_Rectangle_Pattern{
    public static void n(int totRows, int totCols){
         // outer loop
         for(int i = 1; i<=totRows; i++){
            // inner loop - columns
            for(int j = 1;j<=totCols; j++){
                // cell - (i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols){
                    // boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    }
    
    public static void main(String args[]){
        n(10, 25);
    }
}