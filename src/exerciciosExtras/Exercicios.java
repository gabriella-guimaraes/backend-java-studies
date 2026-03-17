package exerciciosExtras;

import exerciciosExtras.classes.Calculadora;
import exerciciosExtras.classes.Carro;
import exerciciosExtras.classes.Musica;
import exerciciosExtras.classes.Pessoa;

public class Exercicios {
    static void main() {
        //Desafios
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "usuário";
        pessoa.exibirSaudacao();

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.duplicaValor(24);
        System.out.println(resultado);

        Musica musica = new Musica();
        musica.titulo = "A Phantom Pain";
        musica.artista = "Ludvig Forssell";
        musica.anoLancamento = 2015;

        musica.exibirFichaTecnica();

        musica.avalia(10);
        musica.avalia(9);
        musica.avalia(8);
        System.out.println(musica.pegaMedia());

        Carro carro = new Carro();
        carro.modelo = "Porsche Cayenne Turbo GT";
        carro.marca = "Porsche";
        carro.ano = 2025;
        carro.cor = "preto";

        carro.exibirFichaTecnica();
    }
}
