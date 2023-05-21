package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;

class VideoStore {
    private List<Video> videos;

    public VideoStore() {
        videos = new ArrayList<>();
    }

    public void addVideo(String title) {
        Video video = new Video(title);
        videos.add(video);
    }

    public void checkOut(String title) {
        Video video = findVideo(title);
        if (video != null) {
            if (!video.isCheckedOut()) {
                video.setCheckedOut(true);
                System.out.println("Successfully checked out " + title);
            } else {
                System.out.println("Video is already checked out.");
            }
        } else {
            System.out.println("Video not found.");
        }
    }

    public void returnVideo(String title) {
        Video video = findVideo(title);
        if (video != null) {
            if (video.isCheckedOut()) {
                video.setCheckedOut(false);
                System.out.println("Successfully returned " + title);
            } else {
                System.out.println("Video is not checked out.");
            }
        } else {
            System.out.println("Video not found.");
        }
    }

    public void receiveRating(String title, double rating) {
        Video video = findVideo(title);
        if (video != null) {
            video.receiveRating((int) rating);
            System.out.println("Rating for " + title + " received.");
        } else {
            System.out.println("Video not found.");
        }
    }

    public void listInventory() {
        System.out.println("Video Inventory:");
        for (Video video : videos) {
            String status = video.isCheckedOut() ? "Checked Out" : "On Shelves";
            System.out.println(video.getTitle() + ", Average Rating: " + video.getAverageRating()
                    + ", Status: " + status);
        }
    }

    private Video findVideo(String title) {
        for (Video video : videos) {
            if (video.getTitle().equals(title)) {
                return video;
            }
        }
        return null;
    }
}
