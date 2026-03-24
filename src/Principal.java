import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

public class Principal {
    static void main() {
        Filme filme = new Filme(); // Tipo Referência

        filme.setNome("Star Wars III: A Vingança dos Sith");
        filme.setAnoLancamento(2005);
        filme.setIncluidoNoPlano(true);
        filme.setDuracaoEmMinutos(180);

        filme.exibeFichcaTecnica();
        filme.avalia(5);
        filme.avalia(10);
        filme.avalia(8);

        System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());
        System.out.println("Nota: " + filme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("Star Wars: Clone Wars");
        serie.setAnoLancamento(2007);
        serie.setIncluidoNoPlano(true);
        serie.setDuracaoEmMinutos(180);
        serie.setTemporadas(7);
        serie.setEpisodiosPorTemporada(12);
        serie.setDuracaoEmMinutos(30);
        serie.exibeFichcaTecnica();

    }
}
