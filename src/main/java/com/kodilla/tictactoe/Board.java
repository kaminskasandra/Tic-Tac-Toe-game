package com.kodilla.tictactoe;


import com.kodilla.tictactoe.figures.Figure;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.tictactoe.TicTacToeGameApplication.BOARD_SIZE;

public class Board {
    private final List<Row> rows = new ArrayList<>();

    public Board() {
        for (int r = 0; r < BOARD_SIZE; r++) {
            rows.add(new Row());
        }
    }
    public Figure getFigure(int col, int row) {
        return rows.get(row).getColumns().get(col);
    }

    public Figure setFigure(int col, int row, Figure figure) {
        return rows.get(row).getColumns().set(col, figure);
    }

    @Override
    public String toString() {
        String t = "";
        for (int c = 0; c < BOARD_SIZE; c++) {
            t += rows.get(c).toString();
        }
        return t;
    }

    public List<Row> getRows() {
        return rows;
    }
}

