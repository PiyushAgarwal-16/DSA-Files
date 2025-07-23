
import java.util.Arrays;
import java.util.Scanner;

// Determine if 2 Strings areanagramsof each other.
// What are anagrams?If two strings contain the same characters but in a different order,theycanbesaidtobeanagrams.Considerraceandcare.Inthiscase,race'scharacterscanbeformedintoastudy,orcare'scharacterscanbeformedintorace.Belowisajavaprogramtocheckiftwostringsare anagrams or not

public class Q4{
    public static boolean anagrams(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char arrstr1[] = str1.toCharArray();
        char arrstr2[] = str2.toCharArray();
        Arrays.sort(arrstr1);
        Arrays.sort(arrstr2);
        return arrstr1 == arrstr2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(anagrams(str1, str2));

    }
}