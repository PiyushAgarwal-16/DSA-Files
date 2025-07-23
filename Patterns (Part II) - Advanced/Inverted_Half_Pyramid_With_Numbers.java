public class Inverted_Half_Pyramid_With_Numbers{
    public static void Inverted_Half_Pyramid_With_Numbers(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=(n-i+1);j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Inverted_Half_Pyramid_With_Numbers(5);
    }
}

