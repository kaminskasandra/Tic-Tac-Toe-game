package com.kodilla.tictactoe;

import com.kodilla.tictactoe.figures.Circle;
import com.kodilla.tictactoe.figures.Cross;
import org.assertj.core.internal.WholeNumbers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class TicTacToeGameApplicationTests {

    @Test
    void testPlayerOWinsInRows() {
        //given
        Board board = new Board();
        board.getRows().get(0).move(0, new Circle());
        board.getRows().get(0).move(1, new Circle());
        board.getRows().get(0).move(2, new Circle());
        //when
        boolean isWinner = WinnerChecker.checkWinner(board, 0, 0, new Circle());
        // then
        assertTrue(isWinner);
    }

    @Test
    void testPlayerOWinsInColumns() {
        //given
        Board board = new Board();
        board.getRows().get(0).move(0, new Circle());
        board.getRows().get(1).move(0, new Circle());
        board.getRows().get(2).move(0, new Circle());
        //when
        boolean isWinner = WinnerChecker.checkWinner(board, 1, 0, new Cross());
        // then
        assertTrue(isWinner);
    }

    @Test
    void testPlayerOWinsDiagonal() {
        //given
        Board board = new Board();
        board.getRows().get(0).move(0, new Circle());
        board.getRows().get(1).move(1, new Circle());
        board.getRows().get(2).move(2, new Circle());
        //when
        boolean isWinner = WinnerChecker.checkWinner(board, 2, 2, new Circle());
        // then
        assertTrue(isWinner);

    }
    @Test
    void testPlayerOWinsAntiDiagonal() {
        //given
        Board board = new Board();
        board.getRows().get(0).move(2, new Circle());
        board.getRows().get(1).move(1, new Circle());
        board.getRows().get(2).move(0, new Circle());
        //when
        boolean isWinner = WinnerChecker.checkWinner(board, 2, 0, new Circle());
        // then
        assertTrue(isWinner);
    }
    @Test
    void testPlayerXWinsInRows() {
        //given
        Board board = new Board();
        board.getRows().get(0).move(0, new Cross());
        board.getRows().get(0).move(1, new Cross());
        board.getRows().get(0).move(2, new Cross());
        //when
        boolean isWinner = WinnerChecker.checkWinner(board, 0, 0, new Cross());
        // then
        assertTrue(isWinner);
    }

    @Test
    void testPlayerXWinsInColumns() {
        //given
        Board board = new Board();
        board.getRows().get(0).move(0, new Cross());
        board.getRows().get(1).move(0, new Cross());
        board.getRows().get(2).move(0, new Cross());
        //when
        boolean isWinner = WinnerChecker.checkWinner(board, 1, 0, new Cross());
        // then
        assertTrue(isWinner);
    }

    @Test
    void testPlayerXWinsDiagonal() {
        //given
        Board board = new Board();
        board.getRows().get(0).move(0, new Cross());
        board.getRows().get(1).move(1, new Cross());
        board.getRows().get(2).move(2, new Cross());
        //when
        boolean isWinner = WinnerChecker.checkWinner(board, 2, 2, new Cross());
        // then
        assertTrue(isWinner);
    }
    @Test
    void testPlayerXWinsAntiDiagonal() {
        //given
        Board board = new Board();
        board.getRows().get(0).move(2, new Cross());
        board.getRows().get(1).move(1, new Cross());
        board.getRows().get(2).move(0, new Cross());
        //when
        boolean isWinner = WinnerChecker.checkWinner(board, 2, 0, new Cross());
        // then
        assertTrue(isWinner);
    }

    @Test
    void testGameWithoutWinner() {
        //given
        Board board = new Board();
        board.getRows().get(0).move(2, new Cross());
        board.getRows().get(1).move(1, new Circle());
        board.getRows().get(2).move(0, new Cross());
        //when
        boolean isWinner = WinnerChecker.checkWinner(board, 2, 0, new Cross());
        // then
        assertFalse(isWinner);
    }

    @Test
    void testWrongMoves() {

    }
}
