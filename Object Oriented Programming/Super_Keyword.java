public class Super_Keyword{
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Horse h1 = new Horse();

        System.out.println(h1.color);
        System.out.println(a1.color);

        h1.hello();
    }
}

class Animal{
    String color;
    void eats(){
        System.out.println("Animal eats");
    }
    Animal(){
        System.out.println("Animal constructor is called.");
    }
}

class Horse extends Animal{

    void eats(){
        System.out.println("Horse eats");
    }
    Horse(){
        super.color = "yellow";
        // super(); // using this Animal's constructor will also be called
        // but you must be thinking if I hadn't written this, it would have been stilled called
        // so the java by defaults calls the super(), to execute the parent's constructor
        System.out.println("Horse constructor is called.");
    }

    void hello(){
        eats(); // eat function from horse
        super.eats(); // eat function from animal
    }
}