public class Question4{
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
        subString2(0, 0, "aba",0);
    }
}


// Question4: 
// We are given a string S, and we need to find the count of all contiguous substrings 
// that start and end with the same character.
//
// Sample Input 1: 
// S = "abcab"
// Sample Output 1: 
// 7
// Explanation: 
// There are 15 substrings of "abcab": a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b.
// Out of these substrings, the ones that start and end with the same character are: 
// a, abca, b, bcab, c, a, and b. 
// Hence, the count is 7.
//
// Sample Input 2: 
// S = "aba"
// Sample Output 2: 
// 4
// Explanation: 
// The substrings are: a, b, a, and aba. 
// All of these substrings start and end with the same character.