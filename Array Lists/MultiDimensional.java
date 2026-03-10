import java.util.*;

public class MultiDimensional{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); list1.add(2); list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4); list2.add(5); list2.add(6); list2.add(7);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(8); list3.add(9); list3.add(10);


        matrix.add(list1);
        matrix.add(list2);
        matrix.add(list3);

        System.out.println(matrix);

        // using nested loops
        for(int i = 0; i<matrix.size(); i++){
            ArrayList<Integer> currList = matrix.get(i);
            for(int j = 0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}