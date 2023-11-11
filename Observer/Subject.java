public interface Subject {
    
    public void registerObserver(ProdutoObserver observer);

    public void removeObserver(ProdutoObserver observer);

    public void notifyObservers();
}
