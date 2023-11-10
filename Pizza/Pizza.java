public abstract class Pizza {
    
    protected String nome;
    protected Double valor;

    protected Borda borda;

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public Borda getBorda() {
        return borda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setBorda(Borda borda) {
        this.borda = borda;
    }

    
}
