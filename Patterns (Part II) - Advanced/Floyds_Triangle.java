public class Floyds_Triangle{
    public static void Floyds_Triangle(int n){
        int count = 1;
        for (int i = 1;i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(count + " ");
                count++;
            }
            // count=1;
            System.out.println();
        }
    }

    public static void main(String args[]){
        Floyds_Triangle(5);
    }
}