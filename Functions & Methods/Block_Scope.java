public class Block_Scope{
    public static void main(String[] args) {
        int p = 10;
        {
            int s = 45;
        System.out.println(s); 
        }

        // System.out.println(s); 
        // Will give error
        System.out.println(p);

    }
}