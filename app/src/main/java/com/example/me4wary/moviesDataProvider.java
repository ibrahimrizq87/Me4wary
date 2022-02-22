package com.example.me4wary;

public class moviesDataProvider {
    private int moviePosterRe;
    private String moviesTilte;
    private String moviesRating;

    public int getMoviePosterRe() {
        return moviePosterRe;
    }

    public moviesDataProvider(int moviePosterRe, String moviesTilte, String moviesRating) {
        this.moviePosterRe = moviePosterRe;
        this.moviesTilte = moviesTilte;
        this.moviesRating = moviesRating;
    }

    public void setMoviePosterRe(int moviePosterRe) {
        this.moviePosterRe = moviePosterRe;
    }

    public String getMoviesTilte() {
        return moviesTilte;
    }

    public void setMoviesTilte(String moviesTilte) {
        this.moviesTilte = moviesTilte;
    }

    public String getMoviesRating() {
        return moviesRating;
    }

    public void setMoviesRating(String moviesRating) {
        this.moviesRating = moviesRating;
    }
}
