public class Question2{
    public static void englishString(int num){
        if(num <= 0){
            return;
        }

        englishString(num/10);
        int remainder = num % 10;
        switch(remainder){
            case 1 -> {
                System.out.print("one" + " ");
            }
            case 2 -> {
                System.out.print("two" + " ");
            }
            case 3 -> {
                System.out.print("three" + " ");
            }
            case 4 -> {
                System.out.print("four" + " ");
            }
            case 5 -> {
                System.out.print("five" + " ");
            }
            case 6 -> {
                System.out.print("six" + " ");
            }
            case 7 -> {
                System.out.print("seven" + " ");
            }
            case 8 -> {
                System.out.print("eight" + " ");
            }
            case 9 -> {
                System.out.print("nine" + " ");
            }
            case 0 -> {
                System.out.print("zero" + " ");
            }
        }
    }
    public static void main(String[] args) {
        englishString(20050);
    }
}

// NOTE: My solution works also for the number which has 0 in the last

// Question 2: You are given a number (e.g., 2019), and you need to convert it into a string of English words like “two zero one nine”. 
// Use a recursive function to solve this problem. 
// NOTE: The digits of the number will only be in the range 0-9, and the last digit of the number can’t be 0. 
// Sample Input: 1947 
// Sample Output: “one nine four seven”