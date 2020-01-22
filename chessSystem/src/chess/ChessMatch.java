package chess;

import boardGame.Board;

public class ChessMatch {

    private Board bord;

    public ChessMatch (){
        bord = new Board(8,8);
    }

    public ChessPiece[][] getPiece(){
        ChessPiece[][] mat = new ChessPiece[bord.getRows()][bord.getColumns()];
        for (int i = 0; i<bord.getRows();i++){
            for (int j = 0; j<bord.getColumns();j++){
                mat[i][j] = (ChessPiece) bord.piece(i,j);
            }
        }
        return mat;
    }
}
