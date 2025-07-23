// Question 1 :Write a Java method to compute the average of three numbers..

public class Solution_1{
    public static void avg(int a, int b, int c){
        int avg = (a + b + c)/3; 
        System.out.println("Average of three numbers: " + avg);
    }
    public static void main(String args[]){
        avg(4,3,5);
    }
}