public class rough{
    public static void main(String args[]){
        String str = "afternoon";
        int n = str.length() - 1;
        boolean isPalindrome = true;

        for(int i = 0; i<=(n/2); i++){
            if(str.charAt(i) != str.charAt(n-i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("It's a palindrome.");
        }
        else{
            System.out.println("Not a palindrome.");
        }
    }
}