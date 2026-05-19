import java.util.*;

public class LL_using_framework{
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        // ArrayList<Integer> h1 = new ArrayList<>();

        // add
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        
        ll.removeLast();
        ll.removeFirst();

        System.out.println(ll);
    }
}