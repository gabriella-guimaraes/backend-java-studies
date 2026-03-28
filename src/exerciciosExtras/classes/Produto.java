package exerciciosExtras.classes;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double aplicarDesconto(int desconto) {
        double percentual = (double) desconto / 100;
        double valorDesconto = preco * percentual;
        return preco - valorDesconto;
    }

    @Override
    public String toString() {
        return this.getNome() + " Quantidade em estoque: " + this.getQuantidade();
    }
}
