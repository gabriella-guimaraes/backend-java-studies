package br.com.screenmatch.modelos;

public class Filme {
    //Abstração
    public String nome;
    public int anoLancamento;
    public boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    public int duracaoEmMinutos;

    //Métodos - Ações comuns de objetos da classe filme
    public void exibeFichcaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + somaDasAvaliacoes);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
    }
    
    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    //Método Acessor
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }


}
