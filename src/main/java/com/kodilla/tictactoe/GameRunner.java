package com.kodilla.tictactoe;

import java.util.Scanner;

public class GameRunner {

    private Figure whoseMove = new Cross();

    public void TttRunner(Board board) {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;

        System.out.println("Welcome to the 'Tic-Tac-Toe' game. Please enter your name:");
        String name = scanner.nextLine();
        System.out.println(("Select game version. 1 - game with the computer 2 - game with another user"));
        String gameVersion = scanner.nextLine();
        if (gameVersion.equals("1")) {
            System.out.println("You will play against the computer");
        } else if (gameVersion.equals("2")) {
            System.out.println(("You will play against the another player. Please enter the second player's name:"));
            String nameSecondPlayer = scanner.nextLine();
        } else {
            System.out.println("Incorrect choice. Enter 1 or 2");
            gameVersion = scanner.nextLine();
            if (gameVersion.equals("1")) {
                System.out.println("You will play against the computer");
            } else if (gameVersion.equals("2")) {
                System.out.println(("You will play against the another player. Please enter the second player's name:"));
                String nameSecondPlayer = scanner.nextLine();
            }
        }
        System.out.println("Starting the game..." +
                "Place your shape");
        System.out.println(board);

        while (!end) {
            Coords coords = UserDialogs.getCoords();

            board.getRows().get(coords.getCol()).move(coords.getRow(), whoseMove);
            System.out.println(board);
            end = checkWinner();
            switchPlayer();

        }
    }
    private boolean checkWinner() {
        return false;
    }

    private void switchPlayer() {
        if (whoseMove instanceof Cross) {
            whoseMove = new Circle();
        } else {
            whoseMove = new Cross();
        }
    }
}
