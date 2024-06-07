public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
interface chessplayers{
    void moves();
}
class Queen implements chessplayers{
    public void moves(){
        System.out.println("left,right,up,down,diagonallly");
    }
}

class KIng implements chessplayers{
    public void moves(){
        System.out.println("left,right,up,down");
    }
}

class Pawn implements chessplayers{
public void moves(){
    System.out.println("up,down,diagonallly");
}
}

class hook implements chessplayers{
public void moves(){
System.out.println("left,right,up,down");
}
}