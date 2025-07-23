// pushing elements

public class rough4{
    public static void pushing(int num[]){
        int prev = num.length-2;
        while(prev >= 0){
            num[prev + 1] = num[prev];
            prev--;
        }

        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
    public static void main(String args[]){
        int num[] = {4,5,1,3,2};
        pushing(num);
    }
}