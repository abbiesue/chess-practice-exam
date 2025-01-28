package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class KingMovesCalculator implements PieceMovesCalculator {
    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition position) {
        List<ChessMove> kingMoves = new ArrayList<>();
        ChessPosition startPosition = position;
        int row = startPosition.getRow();
        int col = startPosition.getColumn();

        //check up
        if (row+1 < 9) {
            position = new ChessPosition(row+1,col);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    kingMoves.add(new ChessMove(startPosition, position, null));
                }
            } else {
                kingMoves.add(new ChessMove(startPosition, position, null));
            }
        }
        //check up right
        if (row+1 < 9 && col+1 < 9){
            position = new ChessPosition(row+1,col+1);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    kingMoves.add(new ChessMove(startPosition, position, null));
                }
            } else {
                kingMoves.add(new ChessMove(startPosition, position, null));
            }
        }
        //check right
        if (col+1 < 9) {
            position = new ChessPosition(row,col+1);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    kingMoves.add(new ChessMove(startPosition, position, null));
                }
            } else {
                kingMoves.add(new ChessMove(startPosition, position, null));
            }
        }
        //check down right
        if (row-1 > 0 && col+1 < 9) {
            position = new ChessPosition(row-1,col+1);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    kingMoves.add(new ChessMove(startPosition, position, null));
                }
            } else {
                kingMoves.add(new ChessMove(startPosition, position, null));
            }
        }
        //check down
        if (row-1 > 0) {
            position = new ChessPosition(row-1,col);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    kingMoves.add(new ChessMove(startPosition, position, null));
                }
            } else {
                kingMoves.add(new ChessMove(startPosition, position, null));
            }
        }
        //check down left
        if (row-1 > 0 && col-1 > 0) {
            position = new ChessPosition(row-1,col-1);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    kingMoves.add(new ChessMove(startPosition, position, null));
                }
            } else {
                kingMoves.add(new ChessMove(startPosition, position, null));
            }
        }
        //check left
        if (col-1 > 0) {
            position = new ChessPosition(row,col-1);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    kingMoves.add(new ChessMove(startPosition, position, null));
                }
            } else {
                kingMoves.add(new ChessMove(startPosition, position, null));
            }
        }
        //check up left
        if (row+1 < 9 && col-1 > 0) {
            position = new ChessPosition(row+1,col-1);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    kingMoves.add(new ChessMove(startPosition, position, null));
                }
            } else {
                kingMoves.add(new ChessMove(startPosition, position, null));
            }
        }

        return kingMoves;
    }
}
