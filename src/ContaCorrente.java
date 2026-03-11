import java.util.Scanner;

public class ContaCorrente {
    static void main() {
        String nomeCliente = "Ichiban Kasuga";
        String tipoConta = "Corrente";
        double saldo = 25000;

        int opcao = 0;
        Scanner numeroDigitado = new Scanner(System.in);

        System.out.printf("""
                
                
                ***********************
                Dados iniciais do cliente:
                Nome: %s
                Tipo conta: %s
                Saldo: %.2f
                ***********************
                
                
                %n""", nomeCliente, tipoConta, saldo);

        String menu = """
                    Digite a opção desejada:
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """;

        while (opcao != 4) {
            System.out.print(menu);
            opcao = numeroDigitado.nextInt();
            System.out.println("Você digitou a opção: " + opcao);

            if (opcao < 1 || opcao > 4) {
                System.out.println("O número digitado é inválido!");
            }

            switch (opcao) {
                case 1:
                    System.out.println("O saldo disponível em conta é: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja receber");
                    saldo += numeroDigitado.nextDouble();
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja transferir");

                    if(numeroDigitado.nextDouble() > saldo) {
                        System.out.println("Saldo insuficiente para a transferência.");
                        break;
                    }

                    saldo -= numeroDigitado.nextDouble();
                    break;
                case 4:
                    break;
            }
        }
    }
}
