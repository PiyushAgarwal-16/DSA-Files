public class rough1{
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        str.compareTo(str);

        for(int i = 0; i<str.length(); i++){
            switch (str.charAt(i)){
                case 'N' -> y2++;
                
                case 'S' -> y2--;

                case 'E' -> x2++;

                case 'W' -> x2--;

                default -> {
                }
            }
        }

        System.out.println(Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2)));
    }
}