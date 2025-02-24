package chessgame;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class ChessGame extends BoardGame{
    private final ChessPlayer player1;
    private final ChessPlayer player2;
    private ChessBoard chessBoard;
    public ChessGame(ChessPlayer player1, ChessPlayer player2, ChessBoard chessBoard) {
        super(chessBoard, new ArrayDeque<Player>(Arrays.asList(player1, player2)));
        this.player1 = player1;
        this.player2 = player2;
        prepareBoard(chessBoard,this.player1,this.player2);
    }
    @Override
    public boolean isOver() {
        return player1.getPiece(PieceName.KING).isDead() || player2.getPiece(PieceName.KING).isDead();
    }
    private void prepareBoard(ChessBoard board, ChessPlayer player1, ChessPlayer player2) {
        placePawns(1, board, player1);
        placePawns(6, board, player1);
        placeRooks(0, board, player1);
        placeRooks(7, board, player2);
        placeKnights(0, board, player1);
        placeKnights(7, board, player2);
        placeBishops(0, board, player1);
        placeBishops(7, board, player2);
        placeKing(0, board, player1);
        placeKing(7, board, player2);
        placeQueen(0, board, player1);
        placeQueen(7, board, player2);

    }
    private void placePawns(int row, ChessBoard board, ChessPlayer player) {
        List<PieceName> pieceNames = Arrays.asList(PieceName.PAWN1, PieceName.PAWN2, PieceName.PAWN3, PieceName.PAWN4, PieceName.PAWN5, PieceName.PAWN6, PieceName.PAWN7, PieceName.PAWN8);
        int col = 0;
        for(PieceName pieceName: pieceNames){
            board.putPiece(player.getPiece(pieceName),row, col++);
        }
    }
    private void placeRooks(int row, ChessBoard board, ChessPlayer player) {
        board.putPiece(player.getPiece(PieceName.ROOK1), row, 0);
        board.putPiece(player.getPiece(PieceName.ROOK2), row, 7);
    }
    private void placeKnights(int row, ChessBoard board, ChessPlayer player) {
        board.putPiece(player.getPiece(PieceName.KNIGHT1), row, 1);
        board.putPiece(player.getPiece(PieceName.KNIGHT2), row, 6);
    }
    private void placeBishops(int row, ChessBoard board, ChessPlayer player) {
        board.putPiece(player.getPiece(PieceName.BISHOP1), row, 2);
        board.putPiece(player.getPiece(PieceName.BISHOP2), row, 5);
    }
    private void placeKing(int row, ChessBoard board, ChessPlayer player) {
        board.putPiece(player.getPiece(PieceName.KING), row, 4);
    }
    private void placeQueen(int row, ChessBoard board, ChessPlayer player) {
        board.putPiece(player.getPiece(PieceName.QUEEN), row, 3);
    }

}
