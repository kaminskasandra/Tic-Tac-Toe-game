package com.kodilla.tictactoe;

import com.kodilla.tictactoe.figures.Figure;

public class WinnerChecker {
    public static boolean checkWinner(Board board, int row, int col, Figure whoseMove) {
        boolean isWinner = true;

        //row
        int counter = 0;
        for (int i = 0; i < board.getBoardSize(); i++) {
            if (!board.getFigure(i, row).equals(whoseMove)) {
                counter = 0;
            } else {
                counter++;
            }
            if (counter >= (Math.min(board.getBoardSize(), 5))) {
                return isWinner;
            }
            counter++;
        }


        //column
        for (int i = 0; i < board.getBoardSize(); i++) {
            if (!board.getFigure(col, i).equals(whoseMove)) {
                isWinner = false;
                break;
            }
            isWinner = true;
        }

        if (isWinner) {
            return isWinner;
        }

        //diagonal
        for (int i = 0; i < board.getBoardSize(); i++) {
            if (!board.getFigure(i, i).equals(whoseMove)) {
                isWinner = false;
                break;
            }
            isWinner = true;
        }
        if (isWinner) {
            return isWinner;
        }

        //anti diagonal
        for (int i = 0; i < board.getBoardSize(); i++) {
            if (!board.getFigure(i, (board.getBoardSize() - 1) - i).equals(whoseMove)) {
                isWinner = false;
                break;
            }
            isWinner = true;
        }

        //draw

        return isWinner;
    }
}
