
import java.util.Scanner;

// Question1:Count how many times lower case vowel so ccurred in a String entered by the user.

public class Q1{
    public static int countVowel(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char a = str.charAt(i);
            if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' ){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countVowel(str));
    }
}