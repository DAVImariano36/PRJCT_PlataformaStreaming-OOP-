public class Movie {

    String name;
    int releaseDate;
    boolean planIncluded;
    int plays;
    double averageReview;
    private double reviewAmount;
    private int totalReviews;
    String genre;
    String synopsis;

    void displayInfo(){
        System.out.println("Nome do Filme: " + name);
        System.out.println("Data de Lançamento: " + releaseDate);
        System.out.println("Gênero: " + genre);
        System.out.println("Sinopse: " + synopsis);
    }

    void measuringReviews(double review){
        reviewAmount += review;
        totalReviews++;
    }

    double starGradeReview(){
        return averageReview = (reviewAmount / totalReviews) / 2;
    }

    int getTotalReviews(){
        return totalReviews;
    }
}
