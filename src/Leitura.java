import java.util.Scanner; // classe

public class Leitura {
    static void main() {
        Scanner leitura = new Scanner(System.in); // observa entradas do teclado

        System.out.println("Digite seu filme favorito.");
        String filmeFavorito = leitura.nextLine();

        System.out.println("Qual o ano de lançamento?");
        int anoLancamento = leitura.nextInt();

        System.out.println("De 0 a 10 qual nota você dá para o filme?");
        double avaliacao = leitura.nextDouble();

        System.out.println(filmeFavorito + " Lançado em: " + anoLancamento + ". Sua avaliação: " + avaliacao + "/10 estrelas");
    }
}
