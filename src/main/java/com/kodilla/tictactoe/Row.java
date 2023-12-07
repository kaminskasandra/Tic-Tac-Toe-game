package com.kodilla.tictactoe;

import com.kodilla.tictactoe.figures.Empty;
import com.kodilla.tictactoe.figures.Figure;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.tictactoe.TicTacToeGameApplication.BOARD_SIZE;

public class Row {
    private final List<Figure> columns = new ArrayList<>();

    public Row() {
        for(int c = 0; c < BOARD_SIZE; c++){
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
        for (int c = 0; c < BOARD_SIZE; c++) {
            h += t + columns.get(c);
        }
        h += t + "\n";
        return h;
    }

    public void move(int index, Figure figure) {
        columns.set(index, figure);
    }


}
