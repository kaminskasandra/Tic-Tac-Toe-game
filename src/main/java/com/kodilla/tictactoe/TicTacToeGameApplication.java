package com.kodilla.tictactoe;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicTacToeGameApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GameRunner gameRunner = new GameRunner();
        Board board = new Board();
        gameRunner.TttRunner(board);
    }
}
