package primeiraAplicacaoJava;

import java.util.Scanner;

public class OutroLoop {
    static void main() {
        Scanner leitura = new Scanner(System.in); // objeto da classe Scanner que observa entradas do teclado
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Digite a sua avaliação para o filme ou -1 para encerrar ");
            nota = leitura.nextDouble();

            if(nota != -1) {
                mediaAvaliacao += + nota; // incrementa e adiciona a nota
                totalNotas++;
            }


        }

        System.out.println("Média de avaliações " + mediaAvaliacao/totalNotas);
    }
}
