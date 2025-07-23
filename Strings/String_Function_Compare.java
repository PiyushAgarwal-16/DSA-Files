public class String_Function_Compare{
    public static void main(String args[]){
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        int a = 4;
        float b = (float)4.0;
        if(a == b){
            System.out.println("Integers are equal");
        } else{
            System.out.println("Integers are not equal");
        }
        if(s1 == s2){
            System.out.println("Strings are equal.");
        } else{
            System.out.println("Strings are not equal.");
        }

        if(s1 == s3){
            System.out.println("Strings are equal.");
        } else{
            System.out.println("Strings are not equal.");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal.");
        } else{
            System.out.println("Strings are not equal.");
        }
    }
}

// In java if we create a String variable s1 with "tony" and then create a second variable s2 
// with "tony" as well, so in the internal memory they both are pointing to same object, or same "tony"
// but when we use new String("tony"), it creates a new "tony"

// hence when we check s1 and s2 using ==, it gives us equal and for s1 and s3 it gives us not equal
// because == check the equality on object level (in case of strings)(because when i did it with integers, it gave me correct results),
// if the two objects are same but to check if the value in it same, we use s1.equals(s3)