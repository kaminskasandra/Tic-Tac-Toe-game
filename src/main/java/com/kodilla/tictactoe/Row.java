package com.kodilla.tictactoe;

import com.kodilla.tictactoe.figures.Empty;
import com.kodilla.tictactoe.figures.Figure;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private final List<Figure> columns = new ArrayList<>();

    public Row() {
        for(int c = 0; c < 3; c++){
            columns.add(new Empty());
        }
    }
    public List<Figure> getColumns() {
        return columns;
    }

    @Override
    public String toString() {
        String t = "|";
        String h = "";
        for (int c = 0; c < 3; c++) {
            h += t + columns.get(c);
        }
        h += t + "\n";
        return h;
    }

    public void move(int index, Figure figure) {
        columns.set(index, figure);
    }


}
