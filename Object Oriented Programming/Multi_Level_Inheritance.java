public class Multi_Level_Inheritance{
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.legs = 4;
        dobby.breed = "German Shepard";
        dobby.breathes();        
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
    int legs;
}

class Dog extends Mammal{
    String breed;
}