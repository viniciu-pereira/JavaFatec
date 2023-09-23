package Aula1609;

public class FrancaBank implements MovimentacaoBusiness {

    @Override
    public void depositar(Conta conta, Double valor) {

        Double adicional = valor * 1.01;
        conta.AtualizarSaldo(adicional);
    }

    @Override
    public void sacar(Conta conta, Double valor) {

        Double limiteTotal = conta.getLimite() + conta.getSaldo();

        if (limiteTotal < valor) {
            System.out.println("sem limite");
            return;
        }
        else{
            conta.AtualizarSaldo(-valor);
        }
    }
    
}
