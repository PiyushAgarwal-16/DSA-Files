public class Abstract_Classes{
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor called....");
        color = "brown";
    }
    void eat(){
        System.out.println("Eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called....");
    }
    void changeColor(String hello){
        this.color = hello;
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken constructor called....");
    }
    void changeColor(String hello){
        this.color = hello;
    }
    void walk(){
        System.out.println("Walks on 2 Legs.");
    }
}