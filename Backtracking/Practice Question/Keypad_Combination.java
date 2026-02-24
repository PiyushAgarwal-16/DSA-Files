public class Keypad_Combination{

    public static void keypadCombination(String digits, String output, int index, String[] mapping){
        //base cases
        if(index>=digits.length()){
            System.out.println(output);
            
            return;
        }

        // recursive cases
        int number = digits.charAt(index) - '0';
        String value = mapping[number];

        for(int i = 0; i<value.length(); i++){
            keypadCombination(digits, output + value.charAt(i), index + 1, mapping);
        }


    }


    public static void main(String args[]){
        String mapping[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int index = 0;
        String output = "";
        String digits = "234";

        keypadCombination(digits, output, index, mapping);

    }
}