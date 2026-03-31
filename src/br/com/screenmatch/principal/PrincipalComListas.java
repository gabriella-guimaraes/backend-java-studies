package br.com.screenmatch.principal;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

import java.util.ArrayList;

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
            Filme itemFilme = (Filme) titulo;
            System.out.println("Classificação " + itemFilme.getClassificacao());
        }
        

    }
}
