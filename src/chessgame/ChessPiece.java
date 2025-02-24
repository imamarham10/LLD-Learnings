package chessgame;

public interface ChessPiece {
    void move(ChessCell source, ChessCell destination, ChessBoard chessBoard);
    boolean isDead();
    void setDead(boolean isDead);
    PieceName getName();

}
