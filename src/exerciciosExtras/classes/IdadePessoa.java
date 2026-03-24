package exerciciosExtras.classes;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean verificarIdade(){
        if(this.idade >= 18){
            System.out.println("Idade maior que 18");
            return true;
        }else{
            System.out.println("Idade menor que 18");
            return false;
        }
    }
}
