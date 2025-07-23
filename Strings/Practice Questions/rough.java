import java.util.Arrays;

// Determine if 2 Strings areanagramsof each other.
// What are anagrams?Iftwostringscontainthesamecharactersbutinadifferentorder,theycanbesaidtobeanagrams.Considerraceandcare.Inthiscase,race'scharacterscanbeformedintoastudy,orcare'scharacterscanbeformedintorace.Belowisajavaprogramtocheckiftwostringsare anagrams or not
public class rough {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}