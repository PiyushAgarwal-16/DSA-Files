import java.util.*;

public class Question4{

    public static ArrayList<Integer> beautiful(int n){
        // base case
        if(n == 1){ 
            ArrayList<Integer> arr = new ArrayList<>(List.of(1));
            return arr;
        }

        ArrayList<Integer> arr = beautiful(n-1);
        ArrayList<Integer> newArr = new ArrayList<>();

        // odd
        for(int i = 0; i<arr.size(); i++){
            int num = (arr.get(i) * 2) - 1;
            if(num <= n){
                newArr.add(num);
            }
        }


        // even
        for(int i = 0; i<arr.size(); i++){
            int num = (arr.get(i) * 2);
            if(num <= n){
                newArr.add(num);
            }
        }


        return newArr;
    }


    public static void main(String[] args) {
        int n = 500;
        beautiful(n);
        System.out.println(beautiful(n));
    }
}

// Beautiful ArrayList (MEDIUM)

// An Arraylist nums of size n is beautiful if:
// nums is a permutation of the integers in the range [1, n].
// For every 0 <= i < j < n, there is no index k with i < k < j where 2 * nums.get(k) == nums.get(i) +
// nums.get(j).
// Given the integer n, return any beautiful arraylist nums of size n. There will be at least one valid
// answer for the given n.

// Sample Input 1 : n = 4
// Sample Output 1 : [2,1,4,3]

// Sample Input 2 : n = 5
// Sample Output 2 : [3,1,2,5,4]

// Constraints :
// ● 1 <= n <= 1000