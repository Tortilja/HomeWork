package io.codelex.PatstavigaisDarbs.ExerciseNr4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReverser {

    public static void main(String[] args) {
        String filePath = "src/test/java/io/codelex/PatstavigaisDarbs/File";

        try {
            // Read the file
            String fileContent = readFile(filePath);

            // Reverse the content
            String reversedContent = reverseString(fileContent);

            // Create a new file with reversed content and same title
            String reversedFilePath = createReversedFile(reversedContent, filePath);

            System.out.println("Reversed file created: " + reversedFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }

        return content.toString();
    }

    private static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    private static String createReversedFile(String content, String originalFilePath) throws IOException {
        String reversedFilePath = getReversedFilePath(originalFilePath);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(reversedFilePath))) {
            writer.write(content);
        }

        return reversedFilePath;
    }

    private static String getReversedFilePath(String originalFilePath) {
        Path path = Paths.get(originalFilePath);
        String fileName = path.getFileName().toString();
        String reversedFileName = reverseString(fileName);
        Path parentPath = path.getParent();
        return parentPath.resolve(reversedFileName).toString();
    }
}