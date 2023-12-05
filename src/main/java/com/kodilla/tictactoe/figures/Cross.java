package com.kodilla.tictactoe.figures;

import com.kodilla.tictactoe.Shape;

import static com.kodilla.tictactoe.Shape.CROSS;

public class Cross implements Figure {
    private Shape shape;

    @Override
    public Shape getShape() {
        return CROSS;
    }

    @Override
    public String toString() {
        return "X";
    }
}
