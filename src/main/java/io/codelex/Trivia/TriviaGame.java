package io.codelex.Trivia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TriviaGame {
    private static final String API_BASE_URL = "http://numbersapi.com/";
    private static final int MAX_QUESTIONS = 20;
    private static final int MAX_ANSWER_OPTIONS = 4;
    private static final String ANSWER_PLACEHOLDER = "___";

    private List<String> usedQuestions;
    private Random random;
    private Scanner scanner;

    public static void main(String[] args) {
        TriviaGame triviaGame = new TriviaGame();
        triviaGame.startGame();
    }

    public TriviaGame() {
        usedQuestions = new ArrayList<>();
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public void startGame() {
        int correctAnswers = 0;

        for (int i = 0; i < MAX_QUESTIONS; i++) {
            try {
                String question = getRandomQuestion();
                List<Integer> answerOptions = getRandomAnswerOptions();

                System.out.println("Question " + (i + 1) + ":");
                System.out.println(formatQuestion(question));

                System.out.println("Choose the correct answer:");
                printAnswerOptions(answerOptions);

                System.out.print("Your answer: ");
                int userAnswer = scanner.nextInt();

                if (userAnswer == getCorrectAnswer(question)) {
                    System.out.println("Correct!");
                    correctAnswers++;
                } else {
                    System.out.println("Wrong! The correct answer is: " + getCorrectAnswer(question));
                }

                System.out.println();
            } catch (IOException e) {
                System.out.println("An error occurred while fetching the question: " + e.getMessage());
            }
        }

        System.out.println("Game over!");
        System.out.println("Correct answers: " + correctAnswers + " out of " + MAX_QUESTIONS);
    }

    private String getRandomQuestion() throws IOException {
        String question;
        do {
            int number = random.nextInt(1000) + 1;
            question = getTriviaQuestion(number);
        } while (usedQuestions.contains(question));
        usedQuestions.add(question);
        return question;
    }

    private String getTriviaQuestion(int number) throws IOException {
        String apiUrl = API_BASE_URL + number;
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        StringBuilder response = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
        }

        return response.toString();
    }

    private int getCorrectAnswer(String question) {
        String regex = "(\\d+).*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(question);

        if (matcher.matches()) {
            return Integer.parseInt(matcher.group(1));
        } else {
            throw new IllegalArgumentException("Cannot extract correct answer from question: " + question);
        }
    }

    private List<Integer> getRandomAnswerOptions() {
        List<Integer> answerOptions = new ArrayList<>();
        int correctAnswer = getCorrectAnswer(usedQuestions.get(usedQuestions.size() - 1));
        answerOptions.add(correctAnswer);

        while (answerOptions.size() < MAX_ANSWER_OPTIONS) {
            int option = random.nextInt(1000) + 1;
            if (!answerOptions.contains(option)) {
                answerOptions.add(option);
            }
        }

        Collections.shuffle(answerOptions);
        return answerOptions;
    }

    private void printAnswerOptions(List<Integer> answerOptions) {
        for (int i = 0; i < answerOptions.size(); i++) {
            System.out.println((i + 1) + ". " + answerOptions.get(i));
        }
    }

    private String formatQuestion(String question) {
        String[] parts = question.split(" is ");
        return ANSWER_PLACEHOLDER + " is" + parts[1].substring(parts[1].indexOf(" "));
    }
}
