public class Inheritance{
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.swims();
        shark.eats();
        shark.breathes();        
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


class Fish extends Animal{
    int fins;

    void swims(){
        System.out.println("Swims in water");
    }
}