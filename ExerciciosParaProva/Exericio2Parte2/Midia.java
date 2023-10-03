package ExerciciosParaProva.Exericio2Parte2;

public abstract class Midia {

    protected String titulo;
    protected int anoLancamento;
    protected int codigo;

    public Midia(String titulo, int anoLancamento, int codigo) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.codigo = codigo;
    }

    public abstract void imprimirInformacoes();
}
