// Print numbers from 1 to N using recursion
// Print numbers from N to 1 using recursion

public class rough4{
    public static void printone_to_n(int n){
        if(n == 0){
            return;
        }
        printone_to_n(n-1);
        System.out.println(n);
    }

    public static void printN_to_one(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printN_to_one(n-1);
    }

    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int naturalNumbers(int n){
        if(n == 1){
            return 1;
        }
        return n + naturalNumbers(n-1);
    }

    public static void main(String args[]){
        System.out.println(naturalNumbers(6));
    }
}