package ExerciciosParaProva.Exercicio3Parte2;

public class App {

    public static void main(String[] args) {

        Universidade princeton = new Universidade("Princeton");
        Universidade cambridge = new Universidade("Cambridge");

        Pessoa einstein = new Pessoa("Albert Einstein");
        einstein.setUniversidade(princeton);

        Pessoa newton = new Pessoa("Isaac Newton");
        newton.setUniversidade(cambridge);

        einstein.imprimir();
        newton.imprimir();
    }
}
