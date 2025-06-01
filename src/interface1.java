public class interface1 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface chessPlayer {
    void moves();

}

class Queen implements chessPlayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal(in all direction)");
    }
}

class Rook implements chessPlayer {
    public void moves() {
        System.out.println("up,down,left,right ");
    }
}

class King implements chessPlayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal(by 1 step)");
    }
}