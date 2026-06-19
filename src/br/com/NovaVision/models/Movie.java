package br.com.NovaVision.models;

public class Movie extends Titles {

    private String director;

    public Movie(String genre, String name) {
        super(genre, name);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
