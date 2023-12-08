package com.kodilla.tictactoe;

import com.kodilla.tictactoe.figures.Empty;
import com.kodilla.tictactoe.figures.Figure;
import static com.kodilla.tictactoe.WinnerChecker.checkWinner;

public class ComputerMoves {
    public boolean computerMove(Board board, Figure whoseMove) {
        int max = board.getBoardSize();
        int min = 0;

        int secondCoord;
        int firstCoord;

        do {
            firstCoord = (int) Math.floor(Math.random() * (max - min + 1) + min);
            secondCoord = (int) Math.floor(Math.random() * (max - min + 1) + min);
        } while (!board.getRows().get(firstCoord).getColumns().get(secondCoord).getClass().equals(Empty.class));

        System.out.println("Computer move: ");
        board.getRows().get(firstCoord).move(secondCoord, whoseMove);
        return checkWinner(board, firstCoord, secondCoord, whoseMove);
    }
}
