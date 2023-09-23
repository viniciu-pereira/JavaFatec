package Aula1609;

public class MoroBankMovimentacao implements MovimentacaoBusiness{

    @Override
    public void depositar(Conta conta, Double valor) {

        conta.AtualizarSaldo(valor);

    }

    @Override
    public void sacar(Conta conta, Double valor) {

        if(conta.getSaldo() < valor){
            System.out.println("saldo paupérrimo");
            return; 
        }

        conta.AtualizarSaldo(-valor);
    }

}
