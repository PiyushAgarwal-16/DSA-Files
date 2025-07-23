public class Call_by_Value{
 
    public static void swap(int a, int b){ // In call by value, the copy of the variable
    // is passed not the original variable itself, so any changes done in the function
    // doesn't affect the original value

    // In JAVA only call by value is possible
    // Call by reference is not possible in java
    
        // swap
        int temp = a;
        a = b;
        b = temp;

    }
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        swap(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}