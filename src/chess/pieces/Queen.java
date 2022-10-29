/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

/**
 *
 * @author jiulio
 */
public class Queen extends ChessPiece {

    public Queen(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString(){
        return "Q";
    }
}
