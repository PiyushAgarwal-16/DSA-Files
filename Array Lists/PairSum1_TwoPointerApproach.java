import java.util.ArrayList;
public class PairSum1_TwoPointerApproach{

    public static boolean pairSum(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;

        while(lp != rp){ // or lp < rp
            
            // Case 1:
            if(list.get(lp) + list.get(rp) == target){
                System.out.println(list.get(lp) + " " + list.get(rp));
                return true;
            }

            // Case 2:
            if((list.get(lp) + list.get(rp)) < target){
                lp++;
            }
            // Case 3:
            else{
                rp--;
            }

        } 
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 10;
        pairSum(list, target);
    }
}