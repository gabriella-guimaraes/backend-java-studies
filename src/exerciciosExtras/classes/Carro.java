package exerciciosExtras.classes;

import java.time.LocalDate;

public class Carro {
    public String modelo;
    public String cor;
    public int ano;
    public String marca;

    public int calculaIdade(){
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - ano;
    }

    public void exibirFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Marca: " + marca);
        System.out.println("Idade: " + calculaIdade());
    }
}
