package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BishopMovesCalculator implements PieceMovesCalculator {

    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition position) {
        List<ChessMove> bishopMoves = new ArrayList<>();
        ChessPosition startPosition = position;
        int row;
        int col;

        //check up right
        row = startPosition.getRow() + 1;
        col = startPosition.getColumn() + 1;
        while (row < 9 && col < 9) {
            position = new ChessPosition(row,col);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    bishopMoves.add(new ChessMove(startPosition, position, null));
                }
                break;
            }
            bishopMoves.add(new ChessMove(startPosition, position, null));
            row++;
            col++;
        }

        row = startPosition.getRow() - 1;
        col = startPosition.getColumn() +1;
        while (row > 0 && col < 9) {
            position = new ChessPosition(row,col);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    bishopMoves.add(new ChessMove(startPosition, position, null));
                }
                break;
            }
            bishopMoves.add(new ChessMove(startPosition, position, null));
            row--;
            col++;
        }

        row = startPosition.getRow() - 1;
        col = startPosition.getColumn() - 1;
        while (row > 0 && col > 0) {
            position = new ChessPosition(row,col);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    bishopMoves.add(new ChessMove(startPosition, position, null));
                }
                break;
            }
            bishopMoves.add(new ChessMove(startPosition, position, null));
            row--;
            col--;
        }

        row = startPosition.getRow() + 1;
        col = startPosition.getColumn() - 1;
        while (row < 9 && col > 0) {
            position = new ChessPosition(row,col);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    bishopMoves.add(new ChessMove(startPosition, position, null));
                }
                break;
            }
            bishopMoves.add(new ChessMove(startPosition, position, null));
            row++;
            col--;
        }
        //check down right
        //check down left
        //check up left

        return bishopMoves;
    }
}
