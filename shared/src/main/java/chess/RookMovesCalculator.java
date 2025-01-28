package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RookMovesCalculator implements PieceMovesCalculator{
    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition position) {
        List<ChessMove> rookMoves = new ArrayList<>();
        ChessPosition startPosition = position;
        int row;
        int col;

        //check right
        row = startPosition.getRow();
        col = startPosition.getColumn() + 1;
        while (col < 9) {
            position = new ChessPosition(row,col);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    rookMoves.add(new ChessMove(startPosition, position, null));
                }
                break;
            }
            rookMoves.add(new ChessMove(startPosition, position, null));
            col++;
        }
        //check left
        row = startPosition.getRow();
        col = startPosition.getColumn() - 1;
        while (col > 0) {
            position = new ChessPosition(row,col);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    rookMoves.add(new ChessMove(startPosition, position, null));
                }
                break;
            }
            rookMoves.add(new ChessMove(startPosition, position, null));
            col--;
        }
        //check down
        row = startPosition.getRow() - 1;
        col = startPosition.getColumn();
        while (row > 0) {
            position = new ChessPosition(row,col);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    rookMoves.add(new ChessMove(startPosition, position, null));
                }
                break;
            }
            rookMoves.add(new ChessMove(startPosition, position, null));
            row--;
        }
        //check up
        row = startPosition.getRow() + 1;
        col = startPosition.getColumn();
        while (row < 9) {
            position = new ChessPosition(row,col);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    rookMoves.add(new ChessMove(startPosition, position, null));
                }
                break;
            }
            rookMoves.add(new ChessMove(startPosition, position, null));
            row++;
        }

        return rookMoves;
    }
}
