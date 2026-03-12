public class Principal {
    static void main() {
        Filme filme = new Filme(); // Tipo Referência

        filme.nome = "Star Wars III: A Vingança dos Sith";
        filme.anoLancamento = 2005;
        filme.avaliacao = 9.8;
        filme.incluidoNoPlano = true;

        System.out.println(filme.nome);
    }
}
