package ExerciciosParaProva.Exercicio4Parte2;

public class App {

    public static void main(String[] args) {

        Departamento departamento = new Departamento(1, "Ciência da Computação", "Engenharia de Software");

        Pessoa pessoa = new Pessoa("João da Silva", 30);
        pessoa.setDepartamento(departamento);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Departamento: " + pessoa.getDepartamento().getNome());

    }
}
