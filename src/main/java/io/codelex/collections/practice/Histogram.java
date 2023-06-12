package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        displayHistogram(scores);
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readString(path, charset);
    }

    private static void displayHistogram(String scores) {
        String[] scoreArray = scores.split("\\s+");
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (String score : scoreArray) {
            int value = Integer.parseInt(score);
            int range = value / 10 * 10;
            frequencyMap.put(range, frequencyMap.getOrDefault(range, 0) + 1);
        }

        for (int i = 0; i <= 100; i += 10) {
            int rangeStart = i;
            int rangeEnd = i + 9;
            String rangeLabel = String.format("%02d-%02d:", rangeStart, rangeEnd);
            StringBuilder histogramLine = new StringBuilder(rangeLabel);

            if (frequencyMap.containsKey(i)) {
                int frequency = frequencyMap.get(i);
                for (int j = 0; j < frequency; j++) {
                    histogramLine.append(" *");
                }
            }

            System.out.println(histogramLine);
        }
    }
}