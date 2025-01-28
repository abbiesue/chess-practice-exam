package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class QueenMovesCalculator implements PieceMovesCalculator{
    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition position) {
        List<ChessMove> queenMoves = new ArrayList<>();
        ChessPosition startPosition = position;
        int row;
        int col;

        //check up
        row = startPosition.getRow() + 1;
        col = startPosition.getColumn();
        while (row < 9) {
            position = new ChessPosition(row,col);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    queenMoves.add(new ChessMove(startPosition, position, null));
                }
                break;
            }
            queenMoves.add(new ChessMove(startPosition, position, null));
            row++;
        }
        //check up right
        row = startPosition.getRow() + 1;
        col = startPosition.getColumn() + 1;
        while (row < 9 && col < 9) {
            position = new ChessPosition(row,col);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    queenMoves.add(new ChessMove(startPosition, position, null));
                }
                break;
            }
            queenMoves.add(new ChessMove(startPosition, position, null));
            row++;
            col++;
        }
        //check right
        row = startPosition.getRow();
        col = startPosition.getColumn() + 1;
        while (col < 9) {
            position = new ChessPosition(row,col);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    queenMoves.add(new ChessMove(startPosition, position, null));
                }
                break;
            }
            queenMoves.add(new ChessMove(startPosition, position, null));
            col++;
        }
        //check down right
        row = startPosition.getRow() - 1;
        col = startPosition.getColumn() +1;
        while (row > 0 && col < 9) {
            position = new ChessPosition(row,col);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    queenMoves.add(new ChessMove(startPosition, position, null));
                }
                break;
            }
            queenMoves.add(new ChessMove(startPosition, position, null));
            row--;
            col++;
        }
        //check down
        row = startPosition.getRow() - 1;
        col = startPosition.getColumn();
        while (row > 0) {
            position = new ChessPosition(row,col);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    queenMoves.add(new ChessMove(startPosition, position, null));
                }
                break;
            }
            queenMoves.add(new ChessMove(startPosition, position, null));
            row--;
        }
        //check down left
        row = startPosition.getRow() - 1;
        col = startPosition.getColumn() - 1;
        while (row > 0 && col > 0) {
            position = new ChessPosition(row,col);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    queenMoves.add(new ChessMove(startPosition, position, null));
                }
                break;
            }
            queenMoves.add(new ChessMove(startPosition, position, null));
            row--;
            col--;
        }
        //check left
        row = startPosition.getRow();
        col = startPosition.getColumn() - 1;
        while (col > 0) {
            position = new ChessPosition(row,col);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    queenMoves.add(new ChessMove(startPosition, position, null));
                }
                break;
            }
            queenMoves.add(new ChessMove(startPosition, position, null));
            col--;
        }
        //check up left
        row = startPosition.getRow() + 1;
        col = startPosition.getColumn() - 1;
        while (row < 9 && col > 0) {
            position = new ChessPosition(row,col);
            if (board.getPiece(position) != null) {
                if (board.getPiece(position).getTeamColor() != board.getPiece(startPosition).getTeamColor()) {
                    queenMoves.add(new ChessMove(startPosition, position, null));
                }
                break;
            }
            queenMoves.add(new ChessMove(startPosition, position, null));
            row++;
            col--;
        }

        return queenMoves;
    }
}
