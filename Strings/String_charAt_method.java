public class String_charAt_method{
    public static void printLetters(String str) {
        for(int i = 0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String args[]){
        String hello = "Hello";
        System.out.println(hello.charAt(3)); // finds character at a particular index
        printLetters(hello);
    }
}