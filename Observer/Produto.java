//OBSERVER 

public class Produto {
    
    private Long id;
    private Long quntidade;
    private Double precoVenda;
    private Double precoCusto;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getQuntidade() {
        return quntidade;
    }
    public void setQuntidade(Long quntidade) {
        this.quntidade = quntidade;
    }
    public Double getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }
    public Double getPrecoCusto() {
        return precoCusto;
    }
    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }
    
}
