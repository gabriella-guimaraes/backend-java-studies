import br.com.screenmatch.calculo.CalculadoraDeTempo;
import br.com.screenmatch.calculo.FiltroRecomentacao;
import br.com.screenmatch.modelos.Episodio;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

public class Principal {
    static void main() {
        Filme filme = new Filme(); // Tipo Referência

        filme.setNome("Star Wars III: A Vingança dos Sith");
        filme.setAnoLancamento(2005);
        filme.setIncluidoNoPlano(true);
        filme.setDuracaoEmMinutos(180);
        System.out.println("Duração em minutos do filme: " + filme.getDuracaoEmMinutos());

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
        serie.setTemporadas(7);
        serie.setEpisodiosPorTemporada(12);
        serie.setMinutosPorEpisodio(30);
        serie.exibeFichcaTecnica();
        System.out.println("Duração para maratonar " + serie.getNome() + ": " + serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme(); // Tipo Referência
        outroFilme.setNome("Ghost in the Shell");
        outroFilme.setAnoLancamento(2017);
        outroFilme.setIncluidoNoPlano(true);
        outroFilme.setDuracaoEmMinutos(107);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomentacao filtro  = new FiltroRecomentacao();
        filtro.filtra(filme);

        Episodio episodio = new Episodio();
        episodio.setSerie(serie);
        episodio.setNumero(1);
        episodio.setTotalVisualizacoes(1000);
        filtro.filtra(episodio);

    }
}
