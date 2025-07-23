public class Binary_Strings{
    public static void binaryStrings(int n, int lastPlace, StringBuilder str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        binaryStrings(n-1, 0, new StringBuilder(str));
        
        if(lastPlace == 0){
            binaryStrings(n-1, 1, new StringBuilder(str));
        }
    }
    public static void main(String[] args) {
        binaryStrings(3, 0, new StringBuilder());
    }
}