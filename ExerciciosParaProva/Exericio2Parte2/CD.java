package ExerciciosParaProva.Exericio2Parte2;

public class CD extends Midia {

    private String artista;

    public CD(String titulo, int anoLancamento, int codigo, String artista) {
        super(titulo, anoLancamento, codigo);
        this.artista = artista;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Ano de lançamento: " + this.anoLancamento);
        System.out.println("Código: " + this.codigo);
        System.out.println("Artista: " + this.artista);
    }
}