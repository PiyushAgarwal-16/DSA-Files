public class Hybrid_Inheritance{
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

class Tuna extends Fish{
    void runs(){
        System.out.println("runs away");
    }
}

class Shark extends Fish{
    void attack(){
        System.out.println("attacks");
    }
}

class Peacock extends Bird{
    void dance(){
        System.out.println("Peacock dances");
    }
}

class Dog extends Mammal{
    void bark(){
        System.out.println("barks");
    }
}

class Cat extends Mammal{
    void meow(){
        System.out.println("meows");
    }
}

class Human extends Mammal{
    void thinks(){
        System.out.println("Human Thinks");
    }
}