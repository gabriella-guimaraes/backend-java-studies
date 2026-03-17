package exerciciosExtras.classes;

public class Musica {
    public String titulo;
    public String artista;
    public int anoLancamento;
    public double avaliacao;
    public int numeroDeAvaliacoes;

    public void exibirFichaTecnica() {
        System.out.println("Nome da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lancamento: " + anoLancamento);
    }

    public void avalia(double nota) {
        avaliacao += nota;
        numeroDeAvaliacoes ++;
    }

    public double pegaMedia() {
        return avaliacao / numeroDeAvaliacoes;
    }
}
