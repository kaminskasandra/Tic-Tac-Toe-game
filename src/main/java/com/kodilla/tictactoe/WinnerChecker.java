package com.kodilla.tictactoe;

import com.kodilla.tictactoe.figures.Figure;
public class WinnerChecker {
    public static boolean checkWinner(Board board, int row, int col, Figure whoseMove) {
        boolean isWinner = false;
        board.setMoveCount(board.getMoveCount() + 1);

        if (checkWinnerInRow(board, row, whoseMove)) return true;

        if (checkWinnerInColumn(board, col, whoseMove)) return true;

        if (checkWinnerInDiagonal(board, whoseMove)) return true;

        if (checkWinnerInAntiDiagonal(board, whoseMove)) return true;

        if (board.getMoveCount() == (Math.pow(board.getBoardSize(), 2))) {
            System.out.println("It's a draw!");
        }

        return isWinner;
    }

    static boolean checkWinnerInAntiDiagonal(Board board, Figure whoseMove) {
        int counter = 0;
        for (int i = 0; i < board.getBoardSize(); i++) {
            if (!board.getFigure(i, (board.getBoardSize() - 1) - i).equals(whoseMove)) {
                counter = 0;
            } else {
                counter++;
            }
            if (counter >= (Math.min(board.getBoardSize(), 5))) {
                return true;
            }
        }
        return false;
    }

    static boolean checkWinnerInDiagonal(Board board, Figure whoseMove) {
        int counter = 0;
        for (int i = 0; i < board.getBoardSize(); i++) {
            if (!board.getFigure(i, i).equals(whoseMove)) {
                counter = 0;
            } else {
                counter++;
            }
            if (counter >= (Math.min(board.getBoardSize(), 5))) {
                return true;
            }
        }
        return false;
    }

    static boolean checkWinnerInColumn(Board board, int col, Figure whoseMove) {
        int counter = 0;
        for (int i = 0; i < board.getBoardSize(); i++) {
            if (!board.getFigure(col, i).equals(whoseMove)) {
                counter = 0;
            } else {
                counter++;
            }
            if (counter >= (Math.min(board.getBoardSize(), 5))) {
                return true;
            }
        }
        return false;
    }

    static boolean checkWinnerInRow(Board board, int row, Figure whoseMove) {
        int counter = 0;
        for (int i = 0; i < board.getBoardSize(); i++) {
            if (!board.getFigure(i, row).equals(whoseMove)) {
                counter = 0;
            } else {
                counter++;
            }
            if (counter >= (Math.min(board.getBoardSize(), 5))) {
                return true;
            }
        }

        return false;
    }
}