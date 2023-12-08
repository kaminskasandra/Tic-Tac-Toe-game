package com.kodilla.tictactoe;

import com.kodilla.tictactoe.figures.Figure;

public class WinnerChecker {
    public static boolean checkWinner(Board board, int row, int col, Figure whoseMove) {
        boolean isWinner = true;

        //row
        for (int i = 0; i < 3; i++) {
            if (!board.getFigure(i, row).equals(whoseMove)) {
                isWinner = false;
                break;
            }
        }
        if (isWinner) {
            return isWinner;
        }

        //column
        for (int i = 0; i < 3; i++) {
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
        for (int i = 0; i < 3; i++) {
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
        for (int i = 0; i < 3; i++) {
            if (!board.getFigure(i, (3 - 1) - i).equals(whoseMove)) {
                isWinner = false;
                break;
            }
            isWinner = true;
        }

        //draw

        return isWinner;
    }
}
