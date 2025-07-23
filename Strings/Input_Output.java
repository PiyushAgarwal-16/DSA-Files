import java.util.*;

public class Input_Output{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next(); // Takes only one word, not the one after a space
        // name = sc.nextLine(); // Takes whole line
        System.out.println(name);   
    }
}