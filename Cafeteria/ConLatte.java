public class ConLatte extends Bebida {
    

    public CacomLatte(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public String getDescricao(){
        return this.bebida.getDescricao() + "chocolate";
    }

    @Override
    public Double getValor(){
        return 5.3 + this.bebida.getValor();
    }
}
