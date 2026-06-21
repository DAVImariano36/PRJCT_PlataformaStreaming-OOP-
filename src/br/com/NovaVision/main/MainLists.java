package br.com.NovaVision.main;

import br.com.NovaVision.models.Movie;
import br.com.NovaVision.models.Serie;
import br.com.NovaVision.models.Titles;

import java.util.*;

public class MainLists {

    static void main() {

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
        movie1.measuringReviews(10);

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
        movie2.measuringReviews(20);

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
        movie3.measuringReviews(9);

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
        serie1.measuringReviews(9);

        List<Titles> list = new ArrayList<>();
        list.add(movie3);
        list.add(movie2);
        list.add(movie1);
        list.add(serie1);
        Collections.sort(list);
        list.sort(Comparator.comparing(Titles::getReleaseDate));

        for (Titles production: list){
            production.displayInfo();
            System.out.println("Total de Avaliações: " + production.getTotalReviews());
            System.out.println("Avaliação: " + production.getAvarageReview());
            System.out.println("Estrelas: " + production.getClassification());
        }
    }
}
