import java.util.ArrayList;

public class EstoqueSub implements Subject {

    private List<ProdutoObserver> listaObservers = new ArrayList();

    private Produto produto;

    @Override
    public void registerObserver(ProdutoObserver observer) {
        this.listaObservers.add(Observer);

    }

    @Override
    public void removeObserver(ProdutoObserver observer) {
        this.listaObservers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for(Produto observer : this.listaObservers){
            observer.atualizarEstoque(produto);
        }
    }

    public void setProduto(Produto produto){
        this.produto = produto;

        this.notifyObservers();
    }
}
