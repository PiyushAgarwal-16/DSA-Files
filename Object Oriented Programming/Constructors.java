// Constructors is called as we create a new object, in fact, an object is created using the constructor only
// memory allocation is done after constructor is called, if we don't define a constructor
// the java will do it by default for us.

public class Constructors{
    public static void main(String[] args) {
        Student s1 = new Student("Piyush"); // creating new object using our constructor
        Pen p1 = new Pen(); // as we didn't define our own constructor, the java will create a constructor by default

        System.out.println(s1.name);
        System.out.println(p1.color);
    }
}

class Student{
    String name;
    int rollno;

    Student(String newname){ // Constructor
        this.name = newname;
        System.out.println("Constructor is called...");
    }
}

class Pen{
    String color;
    int tip;
}
