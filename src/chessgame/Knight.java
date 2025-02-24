package chessgame;

public class Knight implements ChessPiece{
    private final Color color;
    private final PieceName pieceName;
    private boolean isDead;

    public Knight(Color color, PieceName name) {
        this.color = color;
        this.pieceName = name;
        this.isDead = false;
    }
    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {
        int x_diff = Math.abs(source.getX() - destination.getX());
        int y_diff = Math.abs(source.getY() - destination.getY());

        if (!(Math.max(x_diff,y_diff) == 2 && Math.min(x_diff,y_diff) == 1)) {
            throw new RuntimeException("Invalid move for a knight");
        }
        if(destination.getChessPiece().isPresent()){
            if(destination.getChessPiece().get().equals(this.color)){
                throw new RuntimeException("Cannot capture own piece");
            }else{
                destination.getChessPiece().get().setDead(true);
            }
        }
        chessBoard.removePiece(source.getX(),source.getY());
        chessBoard.putPiece(this,destination.getX(), destination.getY());


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

    public Color getColor() {
        return this.color;
    }
}
