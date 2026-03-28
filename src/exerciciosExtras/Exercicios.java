package exerciciosExtras;

import exerciciosExtras.classes.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Exercicios {
    static void main() {
        //Desafios
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "usuário";
        pessoa.exibirSaudacao();

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.duplicaValor(24);
        System.out.println(resultado);

//        Musica musica = new Musica();
//        musica.titulo = "A Phantom Pain";
//        musica.artista = "Ludvig Forssell";
//        musica.anoLancamento = 2015;
//
//        musica.exibirFichaTecnica();
//
//        musica.avalia(10);
//        musica.avalia(9);
//        musica.avalia(8);
//        System.out.println(musica.pegaMedia());

        Carro carro = new Carro();
        carro.modelo = "Porsche Cayenne Turbo GT";
        carro.marca = "Porsche";
        carro.ano = 2025;
        carro.cor = "preto";

        carro.exibirFichaTecnica();

        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.converterDolarParaReal(100);

        CalcularSalaRetangular calcularSalaRetangular = new CalcularSalaRetangular();
        calcularSalaRetangular.calcularArea(12, 20.5);
        calcularSalaRetangular.calcularPerimetro(24, 30);

        TabuadaMultiplicacao tabuada =  new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(9);

        Musica musica = new Musica();
        musica.setTitulo("A Phantom Pain");
        musica.setArtista("Ludvig Forssell");

        for (int i = 0; i < 1000; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setHost("Braxten Mecham");
        podcast.setTitulo("House of Jacob");
        podcast.setDescricao("Welcome to the House of Jacob Podcast, where in this House we serve the Lord! The “House of Jacob” was a common name in the Old Testament for God’s people, the Israelites. In Christ Jesus we can all become God’s people! We will have new episodes every Sunday at 12PM (CST)!");

        for (int i = 0; i < 2000; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 200; i++) {
            musica.curte();
        }

        Favoritos favoritos = new Favoritos();
        favoritos.inclui(podcast);
        favoritos.inclui(musica);

        Produto produto = new Produto("Papel", 24.5, 100);

        Produto outroProduto = new Produto("Lápis grafite HB", 9.5, 30);

        Produto produtoPremium = new Produto("Café", 30, 50);

        Produto organico = new Produto("Tomate", 7, 10);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        produtos.add(outroProduto);
        produtos.add(produtoPremium);
        produtos.add(organico);
        System.out.println("Quantidade de produtos: " + produtos.size());
        System.out.println(produtos.get(0).getNome());
        System.out.println(produtos);

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Maçã", 9, 20, LocalDate.of(2026, 4, 15));
        System.out.println(produtoPerecivel);
    }
}
