package com.kodilla.tictactoe;

import com.kodilla.tictactoe.figures.Circle;
import com.kodilla.tictactoe.figures.Cross;
import com.kodilla.tictactoe.figures.Empty;
import com.kodilla.tictactoe.figures.Figure;

import java.util.Random;

import static com.kodilla.tictactoe.GameRunner.checkWinner;

public class ComputerMoves {
    public boolean computerMove(Board board, Figure whoseMove) {
        int max = 2;
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
