package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";
    public static void main(String[] args) {


        try {
            Path path = Paths.get(WordCount.class.getResource(file).toURI());
            String content = Files.readString(path, charset);

            int lines = countLines(content);
            int words = countWords(content);
            int characters = countCharacters(content);

            System.out.println("Lines = " + lines);
            System.out.println("Words = " + words);
            System.out.println("Chars = " + characters);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private static int countLines(String content) {
        String[] lines = content.split("\n");
        return lines.length;
    }

    private static int countWords(String content) {
        String[] words = content.split("\\s+");
        return words.length;
    }

    private static int countCharacters(String content) {
        return content.length();
    }
}