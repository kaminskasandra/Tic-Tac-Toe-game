package com.kodilla.tictactoe;
import static com.kodilla.tictactoe.Shape.EMPTY;
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
