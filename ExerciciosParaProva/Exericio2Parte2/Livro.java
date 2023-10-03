package ExerciciosParaProva.Exericio2Parte2;

public class Livro extends Midia {

    private String autor;

    public Livro(String titulo, int anoLancamento, int codigo, String autor) {
        super(titulo, anoLancamento, codigo);
        this.autor = autor;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Ano de lançamento: " + this.anoLancamento);
        System.out.println("Código: " + this.codigo);
        System.out.println("Autor: " + this.autor);
    }
}




