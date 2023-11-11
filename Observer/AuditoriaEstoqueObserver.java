import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuditoriaEstoqueObserver implements ProdutoObserver {
    
    private Map<Long, Lis<Produto>> listaAuditoria = new HashMap<>();

    @Override
    public void atualizarEstoque(Produto produto){

        System.out.println("auditoria" + produto);

        List<Produto> auditoria = listaAuditoria.get(produto.getId());

        if(auditoria == null){
            auditoria = new ArrayList<>();
        }

        auditoria.add(produto){
            this.listaAuditoria.put(produto.getId(), auditoria);
        }
    }
}
