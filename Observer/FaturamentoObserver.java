public class FaturamentoObserver implements Produto {
    
    @Override
    public void atualizarEstoque(Produto produto){
        System.out.println("faturamento" + produto);
    }
}
