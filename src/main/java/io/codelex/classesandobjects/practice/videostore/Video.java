package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private boolean checkedOut;
    private double averageRating;

    public Video(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void receiveRating(double rating) {
        if (rating >= 1 && rating <= 5) {
            int totalRatings = (int) Math.ceil(averageRating * (averageRating + 1) / 2);
            averageRating = (totalRatings * averageRating + rating) / (totalRatings + 1);
        } else {
            System.out.println("Invalid rating. Rating should be between 1 and 5.");
        }
    }
}