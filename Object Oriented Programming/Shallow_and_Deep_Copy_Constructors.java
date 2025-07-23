public class Shallow_and_Deep_Copy_Constructors{

    public static void main(String[] args) {
        Student s1 = new Student(); 
        s1.name = "Piyush";
        s1.roll = 32;
        s1.password = "abcd";
        s1.marks[0] = 20;
        s1.marks[1] = 20;
        s1.marks[2] = 20;

        Student s2 = new Student(s1);
        for(int i = 0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
        System.out.println(s2.name);
        s1.name = "Rahul";
        System.out.println(s2.name);
        System.out.println(s1.name);

        s1.marks[2] = 40;

        for(int i = 0; i<3; i++){
            System.out.println(s1.marks[i]);
        }
        
        for(int i = 0; i<3; i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    // shallow copy constructor
    // Student(Student s){ 
    //     marks = new int[3];
    //     this.name = s.name;
    //     this.roll = s.roll;
    //     this.marks = s.marks;
    // }

    // deep copy constructor
    Student(Student s){ 
        marks = new int[3];
        this.name = s.name;
        this.roll = s.roll;
        for(int i = 0; i< marks.length; i++){
            this.marks[i] = s.marks[i];
        }
    }

    Student(){
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

    Student(String name){
        marks = new int[3];
        this.name = name;
    }

    Student(int rollno){
        marks = new int[3];
        this.roll = rollno;
    }
}