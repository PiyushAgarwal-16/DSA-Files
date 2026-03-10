import java.util.ArrayList;

public class OperationsArrayList{
    public static void main(String args[]){
        ArrayList <Integer> list1 = new ArrayList<>();

        // Adding elements
        list1.add(1); // O(1)
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        list1.add(1, 9); // inserts 9 at index 1

        // Printing
        System.out.println(list1);

        // Get Operation - O(1)
        int element = list1.get(3);
        System.out.println(element);

        // Remove Operation - O(n)
        list1.remove(2);
        System.out.println(list1);


        // Set element at index - O(1)
        list1.set(2, 10); // Replaces element at index 2
        System.out.println(list1);

        // Contains element operation - O(n)
        System.out.println(list1.contains(10));
        System.out.println(list1.contains(42));

        System.out.println(list1.size());

        for(int i = 0; i<list1.size(); i++){
            System.out.print(list1.get(i) + " ");
        }
    }
}