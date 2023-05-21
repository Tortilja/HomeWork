package io.codelex.classesandobjects.practice.Movie;
public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPG(Movie[] movies) {
        int count = 0;
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                count++;
            }
        }

        Movie[] pgMovies = new Movie[count];
        int index = 0;
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                pgMovies[index] = movie;
                index++;
            }
        }

        return pgMovies;
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG-13");
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG-13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");

        Movie[] movies = { movie1, movie2, movie3 };

        Movie[] pgMovies = Movie.getPG(movies);
        System.out.println("PG Movies:");
        for (Movie movie : pgMovies) {
            System.out.println("Title: " + movie.title + ", Studio: " + movie.studio + ", Rating: " + movie.rating);
        }
    }
}
