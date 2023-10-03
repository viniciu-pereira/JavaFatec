package ExerciciosParaProva.Exericio2Parte2;

public class DVD extends Midia {

    private String diretor;

    public DVD(String titulo, int anoLancamento, int codigo, String diretor) {
        super(titulo, anoLancamento, codigo);
        this.diretor = diretor;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Ano de lançamento: " + this.anoLancamento);
        System.out.println("Código: " + this.codigo);
        System.out.println("Diretor: " + this.diretor);
    }
}
