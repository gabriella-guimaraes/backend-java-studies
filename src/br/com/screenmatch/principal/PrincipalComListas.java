package br.com.screenmatch.principal;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    static void main() {
        Filme filme = new Filme("Star Wars III: A Vingança dos Sith", 2005);
        filme.avalia(10);
        Filme outroFilme = new Filme("Ghost in the Shell", 2017);
        outroFilme.avalia(8.5);
        var filmeAnimação = new Filme("A Viagem de Chihiro", 2001);
        filmeAnimação.avalia(10);
        Serie serie = new Serie("Star Wars: Clone Wars", 2007);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme);
        lista.add(outroFilme);
        lista.add(filmeAnimação);
        lista.add(serie);

        for (Titulo titulo : lista) {
            System.out.println(titulo.getNome());
            if(titulo instanceof Filme itemFilme && itemFilme.getClassificacao() > 2){
                System.out.println("Classificação " + itemFilme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Natalie Portman");
        buscaPorArtista.add("Ewan McGregor");
        buscaPorArtista.add("Adam Driver");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Lista ordenada: " +  buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Lista de títulos ordenada: " +  lista);

        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Ordenando por ano: " + lista);

    }
}
