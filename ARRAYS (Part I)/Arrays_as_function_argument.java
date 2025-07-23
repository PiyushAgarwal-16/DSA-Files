
public class Arrays_as_function_argument{
    public static void update(int hello[], int a){
        a = 10;
        for(int i = 0; i<hello.length; i++){
            hello[i] += 1;
        }
    }

// Arrays are passed by reference in java
// but pass by reference doesn't work for variable, etc. in java
// but it works for arrays
    public static void main(String args[]){
        int marks[] = {97, 98, 99};
        int b = 5;
        update(marks,b);
        System.out.println(b);

        // print out marks
        for(int i = 0; i<marks.length; i++){
            System.out.print(marks[i]+" "); 
        }
    }
}