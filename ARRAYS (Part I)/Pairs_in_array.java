public class Pairs_in_array{
    public static void printPairs(int num[]){
        int tp = 0;
        for(int i = 0; i < num.length; i++){
            int current = num[i];
            for(int j = i+1; j<num.length; j++){
                System.out.print("(" + current + ", " + num[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + tp);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        printPairs(numbers);
    }
}