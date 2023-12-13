package com.kodilla.tictactoe;

import com.kodilla.tictactoe.figures.Figure;

public class WinnerChecker {
    public static boolean checkWinner(Board board, int row, int col, Figure whoseMove) {
        boolean isWinner = false;

        //row
        int counter = 0;
        for (int i = 0; i < board.getBoardSize(); i++) {
            if (!board.getFigure(i, row).equals(whoseMove)) {
                counter = 0;
            } else {
                counter++;
            }
            if (counter >= (Math.min(board.getBoardSize(), 5))) {
                System.out.println("test 1");
                return true;
            }
        }

        //column

        for (int i = 0; i < board.getBoardSize(); i++) {
            if (!board.getFigure(col, i).equals(whoseMove)) {
                counter = 0;
            } else {
                counter++;
            }
            if (counter >= (Math.min(board.getBoardSize(), 5))) {
                System.out.println("test2");
                return true;
            }
        }

        //diagonal
        for (int i = 0; i < board.getBoardSize(); i++) {
            if (!board.getFigure(i, i).equals(whoseMove)) {
                counter = 0;
            } else {
                counter++;
            }
            if (counter >= (Math.min(board.getBoardSize(), 5))) {
                System.out.println("test3");
                return true;
            }
        }


        //anti diagonal
        for (int i = 0; i < board.getBoardSize(); i++) {
            if (!board.getFigure(i, (board.getBoardSize() - 1) - i).equals(whoseMove)) {
                counter = 0;
            } else {
                counter++;
            }
            if (counter >= (Math.min(board.getBoardSize(), 5))) {
                System.out.println("test4");
                return true;
            }
        }

        //draw


        return isWinner;
    }
}
