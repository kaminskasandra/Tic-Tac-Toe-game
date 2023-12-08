package com.kodilla.tictactoe;


import com.kodilla.tictactoe.figures.Figure;

import java.util.ArrayList;
import java.util.List;


public class Board {
    private int boardSize;
    private final List<Row> rows = new ArrayList<>();

    public Board(int boardSize) {
        this.boardSize = boardSize;
        for (int r = 0; r < boardSize; r++) {
            rows.add(new Row(boardSize));
        }
    }
    public Figure getFigure(int col, int row) {
        return rows.get(row).getColumns().get(col);
    }

    public Figure setFigure(int col, int row, Figure figure) {
        return rows.get(row).getColumns().set(col, figure);
    }

    public int getBoardSize() {
        return boardSize;
    }

    @Override
    public String toString() {
        String t = "   ";
        for (int i = 0 ; i < boardSize; i++){
            t += i + " ";
        }
        t += "\n";
        for (int c = 0; c < boardSize; c++) {
            t += c + " " + rows.get(c).toString();
        }
        return t;
    }

    public List<Row> getRows() {
        return rows;
    }
}

