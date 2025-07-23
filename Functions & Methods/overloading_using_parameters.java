public class overloading_using_parameters{
    // Function overloading means creating multiple functions with same name
    // but there must be difference in either type of parameters or no. of parameters
    // and also the return type of function must be same
    // meaning int sum and float sum can't exist this will give error
    // For example: 
    //     public static int sum(int a, int b){
    //     return a+b;
    // }

    // public static float sum(int a, int b){
    //     return a + b + c;
    // } 
    // These can't exist together
    // but int sum() and int sum() with different parameter can exist
    // and also int sum() and float sum() with different parameters can exist

    
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String args[]){
        System.out.println(sum(2,5));
        System.out.println(sum(2,5,1));
    }
}