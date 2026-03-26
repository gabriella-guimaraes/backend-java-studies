package exerciciosExtras;

import exerciciosExtras.classes.*;

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

        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.converterDolarParaReal(100);

        CalcularSalaRetangular calcularSalaRetangular = new CalcularSalaRetangular();
        calcularSalaRetangular.calcularArea(12, 20.5);
        calcularSalaRetangular.calcularPerimetro(24, 30);

        TabuadaMultiplicacao tabuada =  new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(9);
    }
}
