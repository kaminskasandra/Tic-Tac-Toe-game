package com.kodilla.tictactoe;

import com.kodilla.tictactoe.figures.Circle;
import com.kodilla.tictactoe.figures.Cross;
import com.kodilla.tictactoe.figures.Figure;
import static com.kodilla.tictactoe.TicTacToeGameApplication.BOARD_SIZE;

import java.util.Scanner;

public class GameRunner {
    private Figure whoseMove = new Cross();

    public void TttRunner(Board board) {
        Scanner scanner = new Scanner(System.in);
        ComputerMoves computerMoves = new ComputerMoves();
        boolean end = false;
        boolean isComputerGame = false;

        System.out.println("Welcome to the 'Tic-Tac-Toe' game. Please enter your name:");
        String name = scanner.nextLine();
        System.out.println(("Select game version. 1 - game with the computer 2 - game with another user"));
        String gameVersion = scanner.nextLine();
        if (gameVersion.equals("1")) {
            System.out.println("You will play against the computer");
            isComputerGame = true;
        } else if (gameVersion.equals("2")) {
            System.out.println(("You will play against the another player. Please enter the second player's name:"));
            String nameSecondPlayer = scanner.nextLine();
        } else {
            System.out.println("Incorrect choice. Enter 1 or 2");
            gameVersion = scanner.nextLine();
        }
        System.out.println("Starting the game..." +
                "Place your shape");
        System.out.println(board);

        while (!end) {
            Coords coords = UserDialogs.getCoords(board);
            board.getRows().get(coords.getRow()).move(coords.getCol(), whoseMove);
            end = checkWinner(board, coords.getRow(), coords.getCol(), whoseMove);
            if (end) {
                System.out.println(board);
                System.out.println("The winner is " + whoseMove);
                break;
            }

            if (isComputerGame) {
                System.out.println(board);
                switchPlayer();
                end = computerMoves.computerMove(board, whoseMove);
                if (end) {
                    System.out.println(board);
                    System.out.println("The winner is " + whoseMove);
                    break;
                }
            }
            System.out.println(board);
            switchPlayer();
        }
    }

    public static boolean checkWinner(Board board, int row, int col, Figure whoseMove) {
        boolean isWinner = true;

        for (int i = 0; i < 3; i++) {
            if (!board.getFigure(i, row).equals(whoseMove)) {
                isWinner = false;
                break;
            }
        }
        if (isWinner) {
            return isWinner;
        }

        for (int i = 0; i < 3; i++) {
            if (!board.getFigure(col, i).equals(whoseMove)) {
                isWinner = false;
                break;
            }
            isWinner = true;
        }

        if (isWinner) {
            return isWinner;
        }
        for (int i = 0; i < 3; i++) {
            if (!board.getFigure(i, i).equals(whoseMove)) {
                isWinner = false;
                break;
            }
            isWinner = true;
        }
        for (int i = 0; i < 3; i++) {
            if (!board.getFigure(i, (3-1) - i).equals(whoseMove)) {
                isWinner = false;
                break;
            }
            isWinner = true;
        }

        return isWinner;
    }

    private void switchPlayer() {
        if (whoseMove instanceof Cross) {
            whoseMove = new Circle();
        } else {
            whoseMove = new Cross();
        }
    }
}
