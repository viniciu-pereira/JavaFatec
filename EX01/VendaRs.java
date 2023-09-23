package EX01;

public class VendaRs extends Venda {

    @Override
    public Produto vender(Produto produto) {

        if (produto.getPreco() <= 1000) {
            produto.setPrecoVenda(produto.getPreco() * 1.15);
        } else {
            produto.setPrecoVenda(produto.getPreco() * 1.10);
        }
        return produto;
    }
}
