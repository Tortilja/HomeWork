package io.codelex.arrays.practice;


import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] words = {"program", "java", "hangman", "computer", "programming", "codelex", "example"};
        String word = words[(int) (Math.random() * words.length)];

        char[] guessedLetters = new char[word.length()];
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';
        }

        int attempts = word.length();
        boolean gameOver = false;

        while (!gameOver) {
            System.out.println("Guessed letters: " + String.valueOf(guessedLetters));
            System.out.println("Attempts left: " + attempts);

            System.out.print("Enter a letter: ");
            char guess = input.nextLine().charAt(0);

            boolean correctGuess = false;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    guessedLetters[i] = guess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                attempts--;
                System.out.println("Incorrect guess!");
            }

            if (attempts == 0) {
                gameOver = true;
                System.out.println("You lost! The word was: " + word);
            }

            if (String.valueOf(guessedLetters).equals(word)) {
                gameOver = true;
                System.out.println("Congratulations! You guessed the word: " + word);
            }
        }
    }
}
