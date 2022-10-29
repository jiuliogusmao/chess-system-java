/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jiulio
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        
        while (true){
            try{
            UI.clearScreen();
            UI.printBoard(chessMatch.getPieces());
            System.out.println("");
            System.out.println("Source: ");
            ChessPosition source = UI.readChessPosition(sc);
            
            System.out.println("");
            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(sc);
            
           ChessPiece capturePiece = chessMatch.peformChessMove(source, target);
            }
            catch (ChessException | InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
    
}
