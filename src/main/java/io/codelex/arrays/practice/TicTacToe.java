package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    private static char currentPlayerSymbol = 'X';

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        initBoard();
        displayBoard();

        boolean gameFinished = false;

        while (!gameFinished) {
            System.out.print("Player " + currentPlayerSymbol + ", enter your move (row[0-2] column[0-2]): ");
            int row = keyboard.nextInt();
            int col = keyboard.nextInt();

            if (isValidMove(row, col)) {
                makeMove(row, col);
                displayBoard();

                if (checkWin()) {
                    System.out.println("Player " + currentPlayerSymbol + " wins! Game Over.");
                    gameFinished = true;
                } else if (isBoardFull()) {
                    System.out.println("It's a tie! Game Over.");
                    gameFinished = true;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move! Please try again.");
            }
        }

        keyboard.close();
    }

    public static void initBoard() {
        // Fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static boolean isValidMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false; // Out of board bounds
        }

        return board[row][col] == ' ';
    }

    public static void makeMove(int row, int col) {
        board[row][col] = currentPlayerSymbol;
    }

    public static boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayerSymbol && board[i][1] == currentPlayerSymbol && board[i][2] == currentPlayerSymbol) {
                return true; // Check rows
            }
            if (board[0][i] == currentPlayerSymbol && board[1][i] == currentPlayerSymbol && board[2][i] == currentPlayerSymbol) {
                return true; // Check columns
            }
        }
        if (board[0][0] == currentPlayerSymbol && board[1][1] == currentPlayerSymbol && board[2][2] == currentPlayerSymbol) {
            return true; // Check diagonal
        }
        if (board[0][2] == currentPlayerSymbol && board[1][1] == currentPlayerSymbol && board[2][0] == currentPlayerSymbol) {
            return true; // Check reverse diagonal
        }
        return false;
    }

    public static boolean isBoardFull() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == ' ') {
                    return false; // Found an empty cell, board is not full
                }
            }
        }
        return true; // No empty cells found, board is full
    }

    public static void switchPlayer() {
        currentPlayerSymbol = (currentPlayerSymbol == 'X') ? 'O' : 'X';
    }
}