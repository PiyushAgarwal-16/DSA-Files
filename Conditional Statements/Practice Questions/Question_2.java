/*
Question 2 : Finish the following code so that it prints You have a fever if your temperature
is above 100 and otherwise prints You don't have a fever.
public class Solution {
public static void main(String[] args) {
double temp = 103.5;
}
}
*/

public class Question_2 {
    public static void main(String args[]){
        double temp = 103.5;

        String fever = (temp > 100) ? "You have a fever" : "You don't have a fever";
        System.out.println(fever);
    }
}

// This question's solution was done using if-else conditionals but i used 
// ternary operator, and my code works