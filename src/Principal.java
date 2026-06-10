import java.util.Scanner;

public class Principal {


    static void main() {
        Scanner reviewCatcher = new Scanner(System.in);

        Movie movie1 = new Movie();
        movie1.name = "Gigantes de Aço";
        movie1.genre = "Ação";
        movie1.releaseDate = 2011;
        movie1.synopsis = """
                Em um futuro próximo onde o boxe robótico é um
                esporte de alto nível, um ex-boxeador em
                dificuldades sente que encontrou um campeão em
                um robô descartado.
                """;
        movie1.planIncluded = true;

        movie1.displayInfo();

        movie1.measuringReviews(7.6);
        movie1.measuringReviews(9.8);
        movie1.measuringReviews(7.2);
        movie1.measuringReviews(8);
        System.out.println("Que nota você dá para este filme?");
        movie1.measuringReviews(reviewCatcher.nextDouble());

        System.out.println("Total de Avaliações: " + movie1.getTotalReviews());
        System.out.println("Estrelas: " + movie1.starGradeReview());
    }
}
