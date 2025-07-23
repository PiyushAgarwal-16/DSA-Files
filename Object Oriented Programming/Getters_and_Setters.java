public class Getters_and_Setters{
    public static void main(String args[]){
        Pen p1 = new Pen(); // pen() here is a constructor
        p1.setColor("blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("yellow");
        System.out.println(p1.getColor());
    }
}


// 'this' here is like self in python, it refers to the current object we are using, or through which we are
// accessing the attribut
class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}