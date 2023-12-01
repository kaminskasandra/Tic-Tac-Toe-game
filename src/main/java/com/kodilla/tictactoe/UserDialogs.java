package com.kodilla.tictactoe;

import java.util.Scanner;

public class UserDialogs {

    public static Coords getCoords() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter coordinates:");
            String input = scanner.nextLine();
            String[] inputs = input.split(",");
            try {
                int col = Integer.parseInt(inputs[0]);
                int row = Integer.parseInt(inputs[1]);
                if (col < 0 || col > 2 || row < 0 || row > 2) {
                    System.out.println("Coordinates must be between 0-2");
                    throw new Exception();
                }
                return new Coords(row, col);
            } catch (Exception e) {
                System.out.println("Wrong number, try again");
            }

        }
    }
}
