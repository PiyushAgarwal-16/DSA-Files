import java.util.*;

public class Swapping{

    public static void swapping(ArrayList<Integer> listX, int i1, int i2){
        int value1 = listX.get(i1);
        int value2 = listX.get(i2);

        value1 = value1 + value2;
        value2 = value1 - value2;
        value1 = value1 - value2;

        listX.set(i1, value1); // setting the value at index i1
        listX.set(i2, value2);
    }
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        int index1 = 2;
        int index2 = 4;

        swapping(list1, index1, index2);

        System.out.println(list1);

    }
}