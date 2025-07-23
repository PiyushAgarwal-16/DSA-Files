public class String_Compression{
    public static String compress(String str){
        StringBuilder newSb = new StringBuilder("");
        
        for(int i = 0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newSb.append(str.charAt(i));
            if(count > 1){
                newSb.append(count.toString());
            }
        }
        return newSb.toString();        
    }
    public static void main(String args[]){
        String str = "aaabbbbbbbcccdds";
        System.out.println(compress(str));
    }   
}