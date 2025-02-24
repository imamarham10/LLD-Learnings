package chessgame;

import java.util.Map;

public class ComputerChessPlayer extends ChessPlayer{

    public ComputerChessPlayer(Map<PieceName, ChessPiece> pieces, ChessBoard chessBoard, String name) {
        super(pieces, chessBoard, name);
    }

    @Override
    public Move makeMove() {
        return null;
    }
}
