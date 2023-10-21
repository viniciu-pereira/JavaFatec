public class BebidaPersonalizada extends BlendDecorator {

    private List<Bebida> ListaBebidas;

    public BebidaPersonalizada(List<Bebida> ListaBebidas) {
        this.ListaBebidas = ListaBebidas;

    }

    @Override
    public String getDescricao() {
        String texto = "Bebida Personalizada: \n";

        for (Bebida b : ListaBebidas) {
            texto += b.getDescricao() + ",";
            return texto;
        }

        return null;
    }

    @Override
    public Double getValor() {
        Double valorBase = 10D;

        for (Bebida b : this.ListaBebidas) {
            valorBase += b.getValor();
        }
        return valorBase;
    }

}
