public class Static_Keyword{
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.schoolName);
        // s1.schoolName = "St.edumnds";
        // System.out.println(s1.schoolName);
        
        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student{
    String name;
    int rollno;

    static String schoolName = "jmv";
    
    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}