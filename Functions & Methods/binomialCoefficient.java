public class binomialCoefficient{
    public static int factorial(int a) {
    int result = 1;
    for (int i = 1; i <= a; i++) {
        result *= i;
    }
    return result;
    }

    public static int binoCoeff(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int binoCoeff = n_fact/(r_fact * nmr_fact);
        return binoCoeff;
    }

    public static void main(String args[]){
        System.out.println(binoCoeff(5, 2));
    }
}