package io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsApp {
    private static final Random RANDOM = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);

    private static int playerWins = 0;
    private static int computerWins = 0;
    private static int totalGames = 0;

    public static void main(String[] args) {
        System.out.println("Let us begin...");
        playGame();
        printSummary();
        System.out.println("Bye!");
    }

    private static void playGame() {
        while (true) {
            RockPaperScissors playerMove = getPlayerMove();
            if (playerMove == null) {
                break;
            }

            RockPaperScissors computerMove = getRandomMove();

            System.out.println("\nRock-Paper-Scissors");
            System.out.println("   Your turn (Enter r for rock, p for paper, s for scissors, q to quit): " + playerMove);
            System.out.println("   My turn: " + computerMove);

            int result = calculateResult(playerMove, computerMove);
            printResult(result);

            if (result == 1) {
                playerWins++;
            } else if (result == -1) {
                computerWins++;
            }
            totalGames++;
        }
    }

    private static RockPaperScissors getPlayerMove() {
        System.out.print("   Your turn (Enter r for rock, p for paper, s for scissors, q to quit): ");
        String input = SCANNER.nextLine().trim().toLowerCase();
        if (input.equals("q")) {
            return null;
        }
        if (input.equals("r")) {
            return RockPaperScissors.ROCK;
        }
        if (input.equals("p")) {
            return RockPaperScissors.PAPER;
        }
        if (input.equals("s")) {
            return RockPaperScissors.SCISSOR;
        }
        System.out.println("   Invalid input, try again...");
        return getPlayerMove();
    }

    private static RockPaperScissors getRandomMove() {
        RockPaperScissors[] moves = RockPaperScissors.values();
        return moves[RANDOM.nextInt(moves.length)];
    }

    private static int calculateResult(RockPaperScissors playerMove, RockPaperScissors computerMove) {
        if (playerMove == computerMove) {
            return 0; // Tie
        }
        if ((playerMove == RockPaperScissors.ROCK && computerMove == RockPaperScissors.SCISSOR)
                || (playerMove == RockPaperScissors.PAPER && computerMove == RockPaperScissors.ROCK)
                || (playerMove == RockPaperScissors.SCISSOR && computerMove == RockPaperScissors.PAPER)) {
            return 1; // Player wins
        }
        return -1; // Computer wins
    }

    private static void printResult(int result) {
        if (result == 0) {
            System.out.println("   Tie!");
        } else if (result == 1) {
            System.out.println("   You won!");
        } else {
            System.out.println("   I won!");
        }
    }

    private static void printSummary() {
        System.out.println("\nNumber of trials: " + totalGames);
        System.out.println("I won " + computerWins + " (" + calculateWinPercentage(computerWins) + "%). "
                + "You won " + playerWins + " (" + calculateWinPercentage(playerWins) + "%).");
    }

    private static double calculateWinPercentage(int wins) {
        return (double) wins / totalGames * 100.0;
    }
}
