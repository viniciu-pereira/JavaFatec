public abstract class Expresso extends Bebida {

    public Expresso() {
        super.descricao = "Expresso cremosinho";
    }

    @Override
    public Double getValor() {
        return 8.5;
    }
}
