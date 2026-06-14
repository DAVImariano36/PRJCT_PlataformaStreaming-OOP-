package br.com.NovaVision.models;

import br.com.NovaVision.tools.Classifiable;

public class Titles implements Classifiable {

    private String name;
    private int releaseDate;
    private boolean planIncluded;
    private int plays;
    private double reviewAmount;
    private int totalReviews;
    private String genre;
    private String synopsis;

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setPlanIncluded(boolean planIncluded) {
        this.planIncluded = planIncluded;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public boolean isPlanIncluded() {
        return planIncluded;
    }

    public String getGenre() {
        return genre;
    }

    public int getPlays() {
        return plays;
    }

    public String getSynopsis() {
        return synopsis;
    }

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

    public double getAvarageReview(){
        double averageReview;
        return averageReview = (reviewAmount / totalReviews);
    }

    public int getTotalReviews(){
        return totalReviews;
    }

    @Override
    public int getClassification() {
        int starGradeReview = 0;
        starGradeReview += (int) (getAvarageReview() / 2);
        return starGradeReview;
    }
}
