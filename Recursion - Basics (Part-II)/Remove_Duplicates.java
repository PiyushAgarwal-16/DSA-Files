public class Remove_Duplicates{
    public static void removeDuplicates(int index, StringBuilder newStr, boolean map[], String str){
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(index);
        if(map[currchar - 'a'] == true){
            removeDuplicates(index+1, newStr, map, str);
        }
        else{
            map[currchar - 'a'] = true;
            removeDuplicates(index+1, newStr.append(currchar), map, str);
        }
    }
    public static void main(String[] args) {
        removeDuplicates(0, new StringBuilder(""), new boolean[26], "appnnacollege");
    }
}