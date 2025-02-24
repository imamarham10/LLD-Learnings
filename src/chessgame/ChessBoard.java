package chessgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChessBoard implements Board{
    private List<List<ChessCell>> cells;
    private final int row = 8;
    private final int col = 8;
    public ChessBoard() {
        this.cells = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            List<ChessCell> chessCells = new ArrayList<>();
            for(int j = 0; j < col; j++) {
                chessCells.add(new ChessCell(i, j));
            }
            this.cells.add(chessCells);
        }
    }
    @Override
    public void display() {
        for(int i=0; i<row;i++){
            for(int j=0; j<col; j++) {
                Optional<ChessPiece> chessPiece = getChessCell(new Pair(i, j)).getChessPiece();
                if(chessPiece.isPresent()){
                    System.out.print(chessPiece.get().getName() + " | ");
                } else {
                    System.out.print("0 | ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public void applyMove(Move move) {
        ChessCell source = getChessCell(move.getSource());
        ChessPiece chessPiece = source.getChessPiece().get();
        chessPiece.move(source, getChessCell(move.getDestination()), this);
    }

    ChessCell getChessCell(Pair position){
        return this.cells.get(position.getX()).get(position.getY());
    }
    public void putPiece(ChessPiece piece, int row, int col){
        ChessCell cell = getChessCell(new Pair(row, col));
        cell.setChessPiece(Optional.of(piece));
    }
    public void removePiece(int row, int col){
        cells.get(row).get(col).setChessPiece(Optional.empty());
    }
}
