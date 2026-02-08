
import java.math.BigInteger;

public class rough2{
    public static BigInteger numbers(int digits[]){
        int n = digits.length;
        BigInteger ten = BigInteger.ONE;
        BigInteger number = BigInteger.ZERO;
        for(int i = n-1; i>=0; i--){
            number = number.add(ten.multiply(BigInteger.valueOf(digits[i])));
            // place *= 10
            ten = ten.multiply(BigInteger.TEN);   
        }
        return number;
        
    }
    public static void main(String args[]){
        int num[] = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        System.out.println(numbers(num));
    }

// public static Integer numbers(int digits[]) {
//     int n = digits.length;
//     Integer number = 0;
//     int multiplier = 1;
    
//     // Approach 2: Starting from the rightmost digit (lowest place value)
//     for (int i = n - 1; i >= 0; i--) {
//         number += digits[i] * multiplier;
//         multiplier *= 10;
//     }
    
//     return number;
// }

}