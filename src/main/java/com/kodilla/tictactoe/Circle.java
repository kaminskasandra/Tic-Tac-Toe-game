package com.kodilla.tictactoe;

import static com.kodilla.tictactoe.Shape.CIRCLE;

public class Circle implements Figure{
    private Shape shape;

    @Override
    public Shape getShape() {
        return CIRCLE;
    }

    @Override
    public String toString() {
        return "O";
    }
}
