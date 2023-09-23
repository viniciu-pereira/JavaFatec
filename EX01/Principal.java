package EX01;

public class Principal {
    
    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        p1.setCodigo(334);
        p1.setTipo("A");
        p1.setDescricao("Agua");
        p1.setPreco(150);
        p1.setQuantidade(200);
        p1.setEstado("SP");

        Venda venda; 

        if("MG".equalsIgnoreCase(p1.getEstado())){
            venda = new Venda();
        }else if("RS".equalsIgnoreCase(p1.getEstado())){
            venda = new VendaRs();
        }
        else{
            venda = new Venda();
        }
        System.out.println(venda.vender(p1));
    }
}
