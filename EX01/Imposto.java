package EX01;

//classe abstrata nao é instanciada
public abstract class Imposto {
    
    public Integer calcularImposto(Produto p){
        return null;
    }

    //classes que usam este metodo devem conter ele instanciado e alterado conforme necessario
    public abstract Integer calcularICMS(Produto p);
}
