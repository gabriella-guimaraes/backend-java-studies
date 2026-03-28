package exerciciosExtras.classes;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {
    private LocalDate dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, LocalDate dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }
}
