public class rough5{
    public static void countingSort(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++){
            largest = Math.max(num[i], largest);
        }
        int count[] = new int[largest + 1];
        for(int i = 0; i<num.length; i++){
            count[num[i]]++;
        }
        int j = 0;
        for(int i = 0; i<count.length; i++){
            while(count[i]>0){
                num[j] = i;
                j++;
                count[i]--;
            }
        }
        for(int i = 0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String args[]){
        int num[] = {1,2,4,5,2,3,2,3,3,5,4,4,1,7,7};
        countingSort(num);
    }
}