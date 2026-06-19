package br.com.NovaVision.main;

import br.com.NovaVision.models.Movie;
import br.com.NovaVision.models.Serie;
import br.com.NovaVision.tools.RecomendationFilter;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {


    static void main() {
        Scanner reviewCatcher = new Scanner(System.in);

        Movie movie1 = new Movie("Ação","Gigantes de Aço");
        movie1.setReleaseDate(2011);
        movie1.setDuration(127);
        movie1.setSynopsis("""
                Em um futuro próximo onde o boxe robótico é um
                esporte de alto nível, um ex-boxeador em
                dificuldades sente que encontrou um campeão em
                um robô descartado.
                """);
        movie1.setDirector("Shawn Levy");
        movie1.setPlanIncluded(true);

        movie1.displayInfo();

        movie1.measuringReviews(7.6);
        movie1.measuringReviews(9.8);
        movie1.measuringReviews(7.2);
        movie1.measuringReviews(8);
        System.out.println("Que nota você dá para este filme?");
        movie1.measuringReviews(reviewCatcher.nextDouble());

        System.out.println("Total de Avaliações: " + movie1.getTotalReviews());
        System.out.println("Avaliação: " + movie1.getAvarageReview());
        System.out.println("Estrelas: " + movie1.getClassification());

        RecomendationFilter recommends = new RecomendationFilter();
        recommends.filter(movie1);

        Serie serie1 = new Serie("Drama Criminal", "Breaking Bad");
        serie1.setReleaseDate(2008);
        serie1.setSynopsis("""
                Um professor de química diagnosticado com câncer
                de pulmão se transforma em fabricante e vendedor
                de metanfetamina, a fim de garantir o futuro da
                sua família.
                """);
        serie1.setFinished(true);
        serie1.setSeasons(5);
        serie1.setEpsodiesBySeason(13);

        Movie movie2 = new Movie("Ação","Círculo de Fogo");
        movie2.setReleaseDate(2013);
        movie2.setDuration(131);
        movie2.setSynopsis("""
                Na guerra entre os humanos e monstros do mar, um
                ex piloto e um estagiário se juntam para tentar
                salvar o mundo.
                """);
        movie2.setDirector("Guilherme del Toro");
        movie2.setPlanIncluded(false);

        movie2.displayInfo();

        System.out.println("Que nota você dá para este filme?");
        movie2.measuringReviews(reviewCatcher.nextDouble());

        System.out.println("Total de Avaliações: " + movie2.getTotalReviews());
        System.out.println("Avaliação: " + movie2.getAvarageReview());
        System.out.println("Estrelas: " + movie2.getClassification());

        Movie movie3 = new Movie("Heróis","O Espetacular Homem-Aranha 2: A Ameaça de Electro");
        movie3.setReleaseDate(2014);
        movie3.setDuration(142);
        movie3.setSynopsis("""
                Preocupado com o fantasma da promessa feita ao pai de
                Gwen Stacy, de que se afastaria para protegê-la dos
                vilões do Homem-Aranha, Peter Parker ainda deve lidar
                com o retorno do velho amigo Harry Osborn e o
                surgimento do poderoso Electro.
                """);
        movie3.setDirector("Marc Webb");
        movie3.setPlanIncluded(false);

        movie3.displayInfo();

        System.out.println("Que nota você dá para este filme?");
        movie3.measuringReviews(reviewCatcher.nextDouble());

        System.out.println("Total de Avaliações: " + movie3.getTotalReviews());
        System.out.println("Avaliação: " + movie3.getAvarageReview());
        System.out.println("Estrelas: " + movie3.getClassification());

        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(movie1);
        moviesList.add(movie2);
        moviesList.add(movie3);
        System.out.println("Tamanho do nosso catálogo de filmes: " + moviesList.size());
        System.out.println("Nosso catálogo" + moviesList);

    }
}
