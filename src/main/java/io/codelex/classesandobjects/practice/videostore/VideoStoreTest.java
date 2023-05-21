package io.codelex.classesandobjects.practice.videostore;
import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);
        VideoStore videoStore = new VideoStore();

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard, videoStore);
                    break;
                case 2:
                    rentVideo(keyboard, videoStore);
                    break;
                case 3:
                    returnVideo(keyboard, videoStore);
                    break;
                default:
                    break;
            }
        }
    }

    private static void fillVideoStore(Scanner scanner, VideoStore videoStore) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.next();
            System.out.println("Enter rating");
            double rating = scanner.nextDouble();
            videoStore.addVideo(movieName);
            videoStore.receiveRating(movieName, rating);
        }
    }

    private static void rentVideo(Scanner scanner, VideoStore videoStore) {
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        videoStore.checkOut(movieName);
    }

    private static void returnVideo(Scanner scanner, VideoStore videoStore) {
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        videoStore.returnVideo(movieName);
    }
}