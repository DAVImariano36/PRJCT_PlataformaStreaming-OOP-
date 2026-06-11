package br.com.NovaVision.models;

public class Movie {

    private String name;
    private int releaseDate;
    private boolean planIncluded;
    private int plays;
    private double averageReview;
    private double reviewAmount;
    private int totalReviews;
    private String genre;
    private String synopsis;

    public void displayInfo(){
        System.out.println("Nome do Filme: " + name);
        System.out.println("Data de Lançamento: " + releaseDate);
        System.out.println("Gênero: " + genre);
        System.out.println("Sinopse: " + synopsis);
    }

    public void measuringReviews(double review){
        reviewAmount += review;
        totalReviews++;
    }

    public double starGradeReview(){
        return averageReview = (reviewAmount / totalReviews) / 2;
    }

    public int getTotalReviews(){
        return totalReviews;
    }
}
