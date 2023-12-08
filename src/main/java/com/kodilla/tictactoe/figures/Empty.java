package com.kodilla.tictactoe.figures;

import static com.kodilla.tictactoe.figures.Shape.EMPTY;
public class Empty implements Figure {
    private Shape shape;
    @Override
    public Shape getShape() {
        return EMPTY;
    }

    @Override
    public String toString() {
        return " ";
    }
}
