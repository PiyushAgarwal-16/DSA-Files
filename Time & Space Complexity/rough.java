public class rough{
    public static void main(String args[]){
        int k = 5, n = 50;
        int count = 0;
        for(int i = 0; i<=n; i=i+k){
            for(int j = 0; j<=k; j++){
                System.out.println(j);
                count++;
            }
        }

        System.out.println("Count: "+ count);
    }
}