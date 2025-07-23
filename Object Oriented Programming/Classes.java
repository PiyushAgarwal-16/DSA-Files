public class Classes{
    public static void main(String args[]){
        Pen p1 = new Pen(); // pen() here is a constructor
        p1.setColor("blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount bank1 = new BankAccount();
        bank1.username = "Piyush Agarwal";
        // bank1.password = "abcd"; This will give error as password is private in the class
        // bank1.setPassword("helloword"); this will also give error as setpassword's access modifier is default

    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class BankAccount{
    public String username; // access modifiers
    private String password; // access modifiers
    void setPassword(String pwd){ // default (package-private) access
        password = pwd;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int physics, int mathematics, int chemistry){
        percentage = (physics + mathematics + chemistry) / 3;
    }
}