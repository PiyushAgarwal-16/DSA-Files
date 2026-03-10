import java.util.ArrayList;

public class Maximum{
    public static void main(String args[]){
        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(2); // O(1)
        list1.add(5);
        list1.add(9);
        list1.add(3);
        list1.add(6);
        list1.add(7);
        
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<list1.size(); i++){
            // if(list1.get(i) > largest){
            //     largest = list1.get(i);
            // }

            largest = Math.max(largest, list1.get(i)); 
        }

        System.out.println(largest);
    }
}