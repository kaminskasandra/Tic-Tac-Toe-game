package com.kodilla.tictactoe;

import com.kodilla.tictactoe.figures.Empty;

import java.util.Scanner;

import static com.kodilla.tictactoe.TicTacToeGameApplication.BOARD_SIZE;

public class UserDialogs {

    public static Coords getCoords(Board board) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter coordinates:");
            String input = scanner.nextLine();
            String[] inputs = input.split(",");

            try {
                int col = Integer.parseInt(inputs[0]);
                int row = Integer.parseInt(inputs[1]);
                if (col < 0 || col > (BOARD_SIZE - 1) || row < 0 || row > (BOARD_SIZE - 1)) {
                    System.out.println("Coordinates must be between 0-" + (BOARD_SIZE - 1));
                    throw new Exception();
                } else if (!board.getRows().get(row).getColumns().get(col).getClass().equals(Empty.class)) {
                    System.out.println("This place is taken");
                    throw new Exception();
                }
                return new Coords(row, col);
            } catch (Exception e) {
                System.out.println("Try again");
            }
        }
    }
}
