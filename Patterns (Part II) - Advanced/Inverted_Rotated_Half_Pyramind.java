public class Inverted_Rotated_Half_Pyramind{
    public static void Inverted_Rotated_Half_Pyramind(int n){
        for(int i = 1; i<=n; i++){
            for (int j = 1; j<=(n-i); j++){
                System.out.print(" ");
                // n = total lines
                // i = no. of the line
                // This code can be used on any pattern to convert 
                // into pattern like this
            }

            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Inverted_Rotated_Half_Pyramind(4);
    }
}