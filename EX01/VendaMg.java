package EX01;

public class VendaMg extends Venda {

    @Override
    public Produto vender(Produto produto) {

        produto = super.vender(produto);
        produto.setPrecoVenda(produto.getPrecoVenda() * 1.085);
        return produto;
    }
}
