package exerciciosExtras.desafios;

//Crie um programa que simula um jogo de adivinhação, que deve geerar um número aleatório entre 0 e 100 e pedir que o usuário tente adivinhar
// o número em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    static void main() {
        int numeroSecreto = new Random().nextInt(100);
        int tentativas = 0;

        Scanner leitor = new Scanner(System.in);
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Advinhe o número secreto.");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if(numeroDigitado == numeroSecreto){
                System.out.println("Você adivinhou o número secreto!");
                break;
            } else if (numeroDigitado < numeroSecreto) {
                System.out.println("O número secreto é maior do que " + numeroDigitado);
            } else if (numeroDigitado > numeroSecreto) {
                System.out.println("O número secreto é menor do que " + numeroDigitado);
            }

        }

        if(tentativas == 5){
            System.out.println("Game over :(");
            System.out.println("O número secreto era: " + numeroSecreto);
        }
    }
}
