package exerciciosExtras.desafios;

import exerciciosExtras.classes.ConsultaCep;
import exerciciosExtras.classes.Endereco;
import exerciciosExtras.classes.GeradorDeArquivo;

import java.io.IOException;
import java.util.Scanner;

public class ConsultaApiViaCEP {
    //TODO:
    // 1 - Criar uma aplicação para consultar a API ViaCEP. url: viacep.com.br/ws/01001000/json/ - OK
    // 2 - Menu para o usuário informar o CEP para busca
    // 3 - Geração de um arquivo .JSON com os dados do endereço
    // Hacker Edition - Explorar os outros endpoints da API
    static void main() {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite o número do CEP para consulta: ");
        var cep = leitura.nextLine();

        try {
            Endereco endereco = consultaCep.buscaEndereco(cep);
            System.out.println(endereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(endereco);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
