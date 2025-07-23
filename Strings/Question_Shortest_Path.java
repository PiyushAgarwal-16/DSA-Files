public class Question_Shortest_Path{
    public static void shortestPath(String str){
        int x = 0, y = 0;

        for(int i = 0; i<str.length(); i++){
            switch (str.charAt(i)) {
                case 'N' -> {y++;}
                case 'S' -> y--;
                case 'W' -> x--;
                case 'E' -> x++;
                default -> {
                }
            }
        }
        System.out.println("(" + x + ", " + y + ")");
        int x2 = x*x; // square of x
        int y2 = y*y; // square of y
        System.out.println("Shortest Distance: " + (float)Math.sqrt(x2 + y2));
 
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        shortestPath(str);
    }
}