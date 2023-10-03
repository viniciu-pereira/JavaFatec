package ExerciciosParaProva.Exercicio3Parte2;

public class Pessoa {

    private String nome;
    private Universidade universidade;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        if (universidade != null) {
            System.out.println("Universidade: " + universidade.getNome());
        }
    }
}