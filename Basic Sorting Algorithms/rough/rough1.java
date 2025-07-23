public class rough1{
    public static void bubbleSort(int num[]){
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j<num.length-1-i; j++){
                if(num[j] > num[j+1]){
                    int temp = num[j+1];
                    num[j+1] = num[j];
                    num[j] = temp;
                }
            }
        }

        for(int i = 0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String args[]){
        int num[] = {4,5,1,3,2};
        bubbleSort(num);
    }
}