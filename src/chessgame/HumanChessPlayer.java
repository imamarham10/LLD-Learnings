package chessgame;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class HumanChessPlayer extends ChessPlayer{

    public HumanChessPlayer(Map<PieceName, ChessPiece> pieces, ChessBoard chessBoard, String name) {
        super(pieces, chessBoard, name);
    }

    @Override
    public Move makeMove() {
        getChessBoard().display();
        int x,y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        Optional<ChessPiece>chessPiece = getChessBoard().getChessCell(new Pair(x,y)).getChessPiece();
        if(chessPiece.isEmpty()){
            throw new RuntimeException("Invalid spot!");
        }
        if(!chessPiece.get().equals(getPiece(chessPiece.get().getName()))){
            throw new RuntimeException("Not your piece!");
        }
        Pair source = new Pair(x,y);
        x = sc.nextInt();
        y = sc.nextInt();
        Pair destination = new Pair(x,y);
        return new Move(source,destination);
    }
}
