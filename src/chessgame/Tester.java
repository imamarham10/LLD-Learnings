package chessgame;

import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        ChessPlayer firstPlayer = new HumanChessPlayer(getPieces(Color.WHITE), board,"Arham");
        ChessPlayer secondPlayer = new ComputerChessPlayer(getPieces(Color.BLACK), board, "TESTER");
        BoardGame game = new ChessGame(firstPlayer, secondPlayer, board);
        game.startGame();
    }

    private static Map<PieceName, ChessPiece> getPieces(Color color) {
        Map<PieceName, ChessPiece> pieces = new HashMap<>();
        pieces.put(PieceName.PAWN1, new Pawn(color,PieceName.PAWN1));
        pieces.put(PieceName.PAWN2, new Pawn(color, PieceName.PAWN2));
        pieces.put(PieceName.PAWN3, new Pawn(color,PieceName.PAWN3));
        pieces.put(PieceName.PAWN4, new Pawn(color, PieceName.PAWN4));
        pieces.put(PieceName.PAWN5, new Pawn(color, PieceName.PAWN5));
        pieces.put(PieceName.PAWN6, new Pawn(color, PieceName.PAWN6));
        pieces.put(PieceName.PAWN7, new Pawn(color, PieceName.PAWN7));
        pieces.put(PieceName.PAWN8, new Pawn(color, PieceName.PAWN8));
        pieces.put(PieceName.BISHOP1, new Bishop(color,PieceName.BISHOP1));
        pieces.put(PieceName.BISHOP2, new Bishop(color,PieceName.BISHOP2));
        pieces.put(PieceName.KNIGHT1, new Knight(color, PieceName.KNIGHT1));
        pieces.put(PieceName.KNIGHT2, new Knight(color, PieceName.KNIGHT2));
        pieces.put(PieceName.ROOK1, new Rook(color, PieceName.ROOK1));
        pieces.put(PieceName.ROOK2, new Rook(color, PieceName.ROOK2));
        pieces.put(PieceName.QUEEN, new Queen(color, PieceName.QUEEN));
        pieces.put(PieceName.KING, new King(color, PieceName.KING));
        return pieces;
    }
}
