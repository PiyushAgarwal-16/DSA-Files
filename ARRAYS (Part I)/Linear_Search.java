public class Linear_Search{
    public static int linearSearch(int num[], int key){

        for(int i = 0; i<num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int linearSearch1(String list[], String key){

        for(int i = 0; i<list.length; i++){
            if(list[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        String menu[] =  {"dosa", "samosa", "coke", "pepsi", "sandwich", "limca"};
        int key = 54;
        String key2 = "pepsi";

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("NOT found");
        }
        else{
            System.out.println("Key is at index: " + index);
        }


        int index2 = linearSearch1(menu, key2);
        if(index2 == -1){
            System.out.println("NOT found");
        }
        else{
            System.out.println("Key is at index: " + index2);
        }
    }
}