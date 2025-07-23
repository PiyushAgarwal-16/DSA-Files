public class Question3{
    public static int count(int count, String str, int index){
        if(index == str.length()){
            return count;
        }

        return count(count+1, str, index+1);
    }
    public static void main(String args[]){
        String str = "Piyush";
        System.out.println(count(0,str,0));
        System.out.print(str.substring(1));
    }
}