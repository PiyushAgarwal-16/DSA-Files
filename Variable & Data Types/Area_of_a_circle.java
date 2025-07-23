import java.util.*;

public class Area_of_a_circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        float rad = sc.nextFloat();
        // Every decimal value will be considered as double in java by default
        // add 'f' in the end to tell the compiler, it's a float value
        float area = 3.14f * rad * rad;
        System.out.println(area);
    }
}