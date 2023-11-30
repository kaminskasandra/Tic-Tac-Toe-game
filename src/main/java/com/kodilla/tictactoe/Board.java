package com.kodilla.tictactoe;


import java.util.ArrayList;
import java.util.List;

public class Board {
    private final List<Row> rows = new ArrayList<>();

    public Board() {
        for (int r = 0; r < 3; r++) {
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
        for (int c = 0; c < 3; c++) {
            t += rows.get(c).toString();
        }
        return t;
    }

    public List<Row> getRows() {
        return rows;
    }
}

