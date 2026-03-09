public class Condicional {
    static void main() {
        int anoLancamento = 2004;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 7.6;
        String tipoPlano = "plus";

        if (anoLancamento >= 2022) {
            System.out.println("Filmes fresquinhos do cinema");
        } else {
            System.out.println("Filmes retrô que vale a pena assistir. Envelheceu como vinho.");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) { // para tipos primitivos o java compara o valor. Já para objetos (String) ele compara o endereço de memória e retorna um bool
            System.out.println("Assita esse filmaço gratuitamente.");
        } else {
            System.out.println("Deve pagar a locação do fillme >:(");
        }
    }
}
