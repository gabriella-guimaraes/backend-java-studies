public class Filme {
    //Abstração
    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    //Métodos - Ações comuns de objetos da classe filme
    void exibeFichcaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + somaDasAvaliacoes);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
    }
    
    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


}
