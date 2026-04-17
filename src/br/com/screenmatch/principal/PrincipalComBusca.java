package br.com.screenmatch.principal;

import br.com.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.screenmatch.modelos.Titulo;
import br.com.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    static void main() throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = leitura.nextLine();
        String apiKey = System.getenv("OMDB_API_KEY");

        String url = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=" +apiKey;

        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(tituloOmdb);

            Titulo titulo = new Titulo(tituloOmdb);
            System.out.println("Título já convertido" + titulo);

        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println("Erro de conversão de ano:");
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Ocorreu um erro: ");
            System.out.println(e.getMessage());
        }

        System.out.println("O programa finalizou corretamente!");
    }
}
