package com.kodilla.tictactoe.figures;

import java.util.Objects;

import static com.kodilla.tictactoe.figures.Shape.CROSS;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cross cross = (Cross) o;
        return shape == cross.shape;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shape);
    }
}
