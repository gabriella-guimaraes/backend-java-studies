void main() {
    IO.println("Esse é o Screen Match.... o Movie Browser só que em Java");

    int anoLancamento = 2004;
    String nomeFilme = "Filme: Star Wars III: A Vingança dos Sith";
    boolean incluidoNoPlano = true;
    double notaDoFilme = 7.6;

    System.out.println("Filme: " + nomeFilme + ". Lançado em: " + anoLancamento + ". Nota média: " + notaDoFilme);
    System.out.println("Disponível no seu plano: " + incluidoNoPlano);

    double notaPublico = 9.8;
    double notaCritica = 7.2;
    double notaTimeSreenMatch = 9.9;

    double media = (notaPublico + notaCritica + notaTimeSreenMatch) / 3;

    System.out.println(media);

    String sinopse = "Um jedi teve um pesadelo e então explodiu a galáxia";
    System.out.println(sinopse);

    int classificacao = (int) (media / 2); // casting explicito

    System.out.println(classificacao);

}
