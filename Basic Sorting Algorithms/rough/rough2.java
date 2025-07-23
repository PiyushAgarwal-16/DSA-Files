// selection sort
public class rough2{
    public static void selectionSort(int num[]){
        for(int i = 0; i<num.length; i++){
            int smallest = Integer.MAX_VALUE;
            for(int j = i; j<num.length; j++){
                smallest = Math.min(smallest, num[j]);
            }
            for(int j = i; j<num.length; j++){
                if(num[j] == smallest){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        for(int i = 0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
    }

    public static void selectionSort2(int num[]){
        for(int i = 0; i<=num.length - 2; i++){
            int minpos = i;
            for(int j = i+1; j<=num.length-1; j++){
                if(num[minpos]>num[j]){
                    minpos = j;
                }
            }

            // swapping
            int temp = num[minpos];
            num[minpos] = num[i];
            num[i] = temp;
        }

        for(int i = 0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
    public static void main(String[] args) {
        int num[] = {4,5,1,3,2};
        selectionSort2(num);
    }
}