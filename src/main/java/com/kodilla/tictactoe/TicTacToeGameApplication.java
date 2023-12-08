package com.kodilla.tictactoe;

import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicTacToeGameApplication {
    public static int BOARD_SIZE = 3;
    public static int WIN_NUMBER = 3;
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        BOARD_SIZE = scanner.nextInt();
        GameRunner gameRunner = new GameRunner();
        Board board = new Board();
        gameRunner.TttRunner(board);
    }
}
