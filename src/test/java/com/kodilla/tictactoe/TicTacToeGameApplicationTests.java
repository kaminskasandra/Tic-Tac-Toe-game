package com.kodilla.tictactoe;

import com.kodilla.tictactoe.figures.Circle;
import com.kodilla.tictactoe.figures.Cross;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TicTacToeGameApplicationTests {

    @Test
    void testPlayerOWinsInRows() {
        //given
        Board board = new Board(3);
        board.getRows().get(0).move(0, new Circle());
        board.getRows().get(0).move(1, new Circle());
        board.getRows().get(0).move(2, new Circle());
        //when
        boolean isWinner = WinnerChecker.checkWinnerInRow(board, 0, new Circle());
        // then
        assertTrue(isWinner);
    }

    @Test
    void testPlayerOWinsInColumns() {
        //given
        Board board = new Board(3);
        board.getRows().get(0).move(0, new Circle());
        board.getRows().get(1).move(0, new Circle());
        board.getRows().get(2).move(0, new Circle());
        //when
        boolean isWinner = WinnerChecker.checkWinnerInColumn(board, 0, new Circle());
        // then
        assertTrue(isWinner);
    }

    @Test
    void testPlayerOWinsDiagonal() {
        //given
        Board board = new Board(3);
        board.getRows().get(0).move(0, new Circle());
        board.getRows().get(1).move(1, new Circle());
        board.getRows().get(2).move(2, new Circle());
        //when
        boolean isWinner = WinnerChecker.checkWinnerInDiagonal(board, new Circle());
        // then
        assertTrue(isWinner);

    }
    @Test
    void testPlayerOWinsAntiDiagonal() {
        //given
        Board board = new Board(3);
        board.getRows().get(0).move(2, new Circle());
        board.getRows().get(1).move(1, new Circle());
        board.getRows().get(2).move(0, new Circle());
        //when
        boolean isWinner = WinnerChecker.checkWinnerInAntiDiagonal(board, new Circle());
        // then
        assertTrue(isWinner);
    }
    @Test
    void testPlayerXWinsInRows() {
        //given
        Board board = new Board(3);
        board.getRows().get(0).move(0, new Cross());
        board.getRows().get(0).move(1, new Cross());
        board.getRows().get(0).move(2, new Cross());
        //when
        boolean isWinner = WinnerChecker.checkWinnerInRow(board, 0, new Cross());
        // then
        assertTrue(isWinner);
    }

    @Test
    void testPlayerXWinsInColumns() {
        //given
        Board board = new Board(3);
        board.getRows().get(0).move(0, new Cross());
        board.getRows().get(1).move(0, new Cross());
        board.getRows().get(2).move(0, new Cross());
        //when
        boolean isWinner =WinnerChecker.checkWinnerInColumn(board, 0, new Cross());
        // then
        assertTrue(isWinner);
    }

    @Test
    void testPlayerXWinsDiagonal() {
        //given
        Board board = new Board(3);
        board.getRows().get(0).move(0, new Cross());
        board.getRows().get(1).move(1, new Cross());
        board.getRows().get(2).move(2, new Cross());
        //when
        boolean isWinner = WinnerChecker.checkWinnerInDiagonal(board, new Cross());
        // then
        assertTrue(isWinner);
    }
    @Test
    void testPlayerXWinsAntiDiagonal() {
        //given
        Board board = new Board(3);
        board.getRows().get(0).move(2, new Cross());
        board.getRows().get(1).move(1, new Cross());
        board.getRows().get(2).move(0, new Cross());
        //when
        boolean isWinner = WinnerChecker.checkWinnerInAntiDiagonal(board, new Cross());
        // then
        assertTrue(isWinner);
    }

    @Test
    void testGameWithoutWinner() {
        //given
        Board board = new Board(3);
        board.getRows().get(0).move(2, new Cross());
        board.getRows().get(0).move(1, new Circle());
        board.getRows().get(0).move(0, new Cross());
        board.getRows().get(1).move(0, new Circle());
        board.getRows().get(2).move(0, new Cross());
        board.getRows().get(1).move(1, new Circle());
        board.getRows().get(2).move(1, new Cross());
        board.getRows().get(1).move(2, new Cross());
        board.getRows().get(2).move(2, new Circle());
        //when
        boolean isWinner = WinnerChecker.checkWinner(board, 2, 0, new Cross());
        // then
        assertFalse(isWinner);
    }

    @Test
    void testWrongMovesThrowsAnException() {

    }
}
