public class ConCafe extends BlendDecorator {

    public ConCafe(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return "Concafe" + this.bebida.getDescricao();
    }

    @Override
    public Double getValor() {
        return 10.0 + this.bebida.getValor();
    }
}
