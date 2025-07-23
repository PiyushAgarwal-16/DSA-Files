// Completed Floyd's Triangle Pattern on my own
public class Floyd_Triangle_Pattern{
    public static void main(String args[]){
                int n = 5;
                int number = 1;

        for (int line = 1; line <=n; line++){
            for(int chars = 1; chars <= line; chars++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}