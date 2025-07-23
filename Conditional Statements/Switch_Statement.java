public class Switch_Statement {
    public static void main(String args[]){
        int number = 3;

        switch (number) {
            case 1 : System.out.println("Samosa");
            break;
            case 2: System.out.println("Mango Shake");
            break;
            case 3: System.out.println("Burger");
            break;
            default: System.out.println("We wake up");
        }

        char ch = 'b';

        switch (ch) {
            case 'a': System.out.println("Hello World a");
            break;
            case 'b': System.out.println("Hello world b");
            break;
            case 'd': System.out.println("Hello world d");
            break;
            default: System.out.println("Hello world");
        }
    }
}
