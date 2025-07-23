public class Hierarchial_Inheritance{
    public static void main(String[] args) {
        
    }
}

class Animal{
    String color;

    void eats(){
        System.out.println("Eats");
    }

    void breathes(){
        System.out.println("Breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims in water");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}