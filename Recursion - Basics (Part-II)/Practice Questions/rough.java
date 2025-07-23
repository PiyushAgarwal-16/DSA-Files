public class rough{
    public static void subString(int index1, int index2, String str, int count){
        // if(index1 == str.length()){
        //     return;
        // }
        if(index2 == str.length()){
            return;
        }
        if(str.substring(index1, index2+1).length() == 1){
            count++;
            System.out.println(str.substring(index1, index2+1));
        }
        else if(str.substring(index1, index2+1).charAt(0) == str.substring(index1, index2+1).charAt(str.substring(index1, index2+1).length()-1)){
            count++;
            System.out.println(str.substring(index1, index2+1));
        }
        subString(index1, index2+1, str, count);
        // subString(index1, index2+1, str);
    }
    public static void subString2(int index1, int index2, String str, int count){
        if(index1 == str.length()){
            return;
        }
        subString(index1, index2, str, count);
        subString2(index1, index2, str.substring(index1+1), count);
    }

    public static void main(String[] args) {
        subString2(0, 0, "abcab",0);
    }
}