import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 1; i<=t;i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
            int totalStudents = x*y;
            
            // if(((z/totalStudents)*100) > 50){
            //     System.out.println("yes");
            // }
            // else{
            //     System.out.println("no");
            // }
            System.out.println(totalStudents);
            System.out.println(z);
            System.out.println((float)(z/totalStudents));
	}
}
}
