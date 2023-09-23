package EX01;

public class Produto {

    private int codigo;
    private String tipo;
    private String descricao;
    private int quantidade;
    private double preco;
    private double precoVenda;
    private String estado;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public double getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    

    
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", tipo=" + tipo + ", descricao=" + descricao + ", quantidade="
                + quantidade + ", preco=" + preco + ", precoVenda=" + precoVenda + "]";
    }


    public Produto(){}

}
