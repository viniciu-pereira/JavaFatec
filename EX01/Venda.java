package EX01;

public class Venda {
    
    public Produto vender(Produto produto){
        
        double precoVenda;

        if(produto.getQuantidade() <= 5){
            precoVenda = produto.getPreco() * 1.35;
        }
        else{
            precoVenda = produto.getPreco() * 1.25;
        }
        
        produto.setPrecoVenda(precoVenda);
        return produto;
    }

    
}
