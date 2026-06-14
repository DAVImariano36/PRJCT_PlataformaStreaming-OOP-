package br.com.NovaVision.tools;

public class RecomendationFilter {

    public void filter(Classifiable classificated){
        if (classificated.getClassification() == 5) {
            System.out.println("Obra prima do catálogo!");

    } else if (classificated.getClassification() >= 3) {
            System.out.println("Coloque na sua lista");
        }
    }
}
