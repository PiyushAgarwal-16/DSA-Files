public class Unary_Operators {
    public static void main(String args[]){
        int a = 10;
        int b = 12;
        int c = ++a;
        int d = b++;

        /* Difference between ++a and a++ is that
        in ++a, the value is first increased then used,
        and in a++, the value is first used then increased;

        Same with a-- and --a,
        in a-- first value is used then the value is decreased
        and in --a, first value is decreased then it is used;

        These ++a, a++, --a, and a-- are called unary operators, as
        the second operant will always be number 1;
        */
        System.out.println(a);
        System.out.println(c);
        System.out.println(b);
        System.out.println(d);
    }
}