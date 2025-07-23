public class Types_of_Constructors{

    // here appropriate constructor will be used by java, according to argument passed by the user
    // this is known as constructor overloading
    // and this is a concept of polymorphism
    public static void main(String[] args) {
        Student s1 = new Student();        
        Student s2 = new Student("Piyush");        
        Student s3 = new Student(32);       
    }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("Constructor is called...");
    }

    Student(String name){
        this.name = name;
    }

    Student(int rollno){
        this.roll = rollno;
    }
}