package chessgame;

public class King implements ChessPiece{
    private final Color color;
    private final PieceName pieceName;
    private boolean isDead;

    public King(Color color, PieceName name) {
        this.color = color;
        this.pieceName = name;
        this.isDead = false;
    }
    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {

    }

    @Override
    public boolean isDead() {
        return isDead;
    }

    @Override
    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }

    @Override
    public PieceName getName() {
        return pieceName;
    }
}
