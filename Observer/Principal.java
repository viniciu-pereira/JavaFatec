public class Principal {
    
    public static void main(String[] args) {
        
        Subject estoqueSubject = new EstoqueSub();

        ProdutoObserver auditoria = new AuditoriaEstoqueObserver();

        ProdutoObserver faturamento = new FaturamentoObserver();

        estoqueSubject.registerObserver(faturamento);
        estoqueSubject.registerObserver(auditoria);

        Produto p = new Produto();

        p.setId(1);
        p.setPrecoCusto(10D);
        p.setPrecoVenda(200D);
        p.setQuntidade(2000);

        estoqueSubject.setProduto(p);

        p.setQuntidade(3000);
        estoqueSubject.setProduto(p);
    }
}
