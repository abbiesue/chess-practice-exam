package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PawnMovesCalculator implements PieceMovesCalculator{
    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition position) {
        List<ChessMove> pawnMoves = new ArrayList<>();
        ChessPosition startPosition = position;
        int row = startPosition.getRow();
        int col = startPosition.getColumn();

        if (board.getPiece(startPosition).getTeamColor() == ChessGame.TeamColor.WHITE) {
           if (row+1 < 9) {
               position = new ChessPosition(row+1, col);
               if (board.getPiece(position) == null) {
                   if (row+1 == 8) {
                       promoteNAdd(pawnMoves, startPosition, position);
                   } else {
                       pawnMoves.add(new ChessMove(startPosition, position, null));
                   }
                   if (startPosition.getRow() == 2) {
                       position = new ChessPosition(row+2, col);
                       if (board.getPiece(position) == null) {
                           pawnMoves.add(new ChessMove(startPosition, position, null));
                       }
                   }
               }
               if (col+1 < 9) {
                   position = new ChessPosition(row+1, col+1);
                   if (board.getPiece(position) != null && board.getPiece(position).getTeamColor() == ChessGame.TeamColor.BLACK) {
                       if (row+1 == 8) {
                           promoteNAdd(pawnMoves, startPosition, position);
                       } else {
                           pawnMoves.add(new ChessMove(startPosition, position, null));
                       }
                   }
               }
               if (col-1 > 0) {
                   position = new ChessPosition(row+1, col-1);
                   if (board.getPiece(position) != null && board.getPiece(position).getTeamColor() == ChessGame.TeamColor.BLACK) {
                       if (row+1 == 8) {
                           promoteNAdd(pawnMoves, startPosition, position);
                       } else {
                           pawnMoves.add(new ChessMove(startPosition, position, null));
                       }
                   }
               }
           }
        }

        if (board.getPiece(startPosition).getTeamColor() == ChessGame.TeamColor.BLACK) {
            if (row-1 > 0) {
                position = new ChessPosition(row-1, col);
                if (board.getPiece(position) == null) {
                    if (row-1 == 1) {
                        promoteNAdd(pawnMoves, startPosition, position);
                    } else {
                        pawnMoves.add(new ChessMove(startPosition, position, null));
                    }
                    if (startPosition.getRow() == 7) {
                        position = new ChessPosition(row-2, col);
                        if (board.getPiece(position) == null) {
                            pawnMoves.add(new ChessMove(startPosition, position, null));
                        }
                    }
                }
                if (col+1 < 9) {
                    position = new ChessPosition(row-1, col+1);
                    if (board.getPiece(position) != null && board.getPiece(position).getTeamColor() == ChessGame.TeamColor.WHITE) {
                        if (row-1 == 1) {
                            promoteNAdd(pawnMoves, startPosition, position);
                        } else {
                            pawnMoves.add(new ChessMove(startPosition, position, null));
                        }
                    }
                }
                if (col-1 > 0) {
                    position = new ChessPosition(row-1, col-1);
                    if (board.getPiece(position) != null && board.getPiece(position).getTeamColor() == ChessGame.TeamColor.WHITE) {
                        if (row-1 == 1) {
                            promoteNAdd(pawnMoves, startPosition, position);
                        } else {
                            pawnMoves.add(new ChessMove(startPosition, position, null));
                        }
                    }
                }
            }
        }

        //if teamcolor == black
            //if the space at (row-1, col) == null
                //if startPosition.getRow() ==  7
                    //add (row-2, col)
                //if space at position.getRow == 1
                    //promote&Add
                // else
                    //add (row+1, col)
        //if (row-1, col+1) or (row-1, col-1) spaces != null and teamColor != white
            // add position to pawnMoves


        return pawnMoves;
    }

    void promoteNAdd(List<ChessMove> pawnMoves, ChessPosition startPosition, ChessPosition endPosition) {
        pawnMoves.add(new ChessMove(startPosition, endPosition, ChessPiece.PieceType.BISHOP));
        pawnMoves.add(new ChessMove(startPosition, endPosition, ChessPiece.PieceType.ROOK));
        pawnMoves.add(new ChessMove(startPosition, endPosition, ChessPiece.PieceType.KNIGHT));
        pawnMoves.add(new ChessMove(startPosition, endPosition, ChessPiece.PieceType.QUEEN));
    }
}
