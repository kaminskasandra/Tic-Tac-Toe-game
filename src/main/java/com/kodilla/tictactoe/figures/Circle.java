package com.kodilla.tictactoe.figures;

import java.util.Objects;

import static com.kodilla.tictactoe.figures.Shape.CIRCLE;

public class Circle implements Figure {
    private Shape shape;

    @Override
    public Shape getShape() {
        return CIRCLE;
    }

    @Override
    public String toString() {
        return "O";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return shape == circle.shape;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shape);
    }
}
