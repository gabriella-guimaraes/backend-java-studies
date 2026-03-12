package primeiraAplicacaoJava;

import java.util.Scanner;

public class Loop {
    static void main() {
        Scanner leitura = new Scanner(System.in); // objeto da classe Scanner que observa entradas do teclado
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("De 0 a 10 qual nota você dá para o filme?");
            nota = leitura.nextDouble();
            mediaAvaliacao += + nota; // incrementa e adiciona a nota

        }

        System.out.println("Média de avaliações " + mediaAvaliacao/3);

    }
}
