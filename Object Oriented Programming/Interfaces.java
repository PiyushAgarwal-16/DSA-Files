public class Interfaces{
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.moves();
        Bear b = new Bear();
        b.graze();
        b.hunt();
    }
}

interface Herbivore{
    void graze();
}

interface Carnivore{
    void hunt();
}

class Bear implements Herbivore, Carnivore{ // multiple inheritance implementation
    public void graze(){
        System.out.println("Bear graze on grass.");
    }

    public void hunt(){
        System.out.println("Bear hunts for food.");
    }
}

interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){ // here public is compulsory as the moves function in chessplayer is also public
    System.out.println("Up, Down, left, right, Diagonal(in all 4 directions)");
    }
}

class King implements chessPlayer{
    public void moves(){
        System.out.println("Up, down, left, right, diagonal - By One step");
    }
}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println("Up, down, left, right");
    }
}