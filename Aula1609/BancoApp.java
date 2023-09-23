package Aula1609;

public class BancoApp {

    public static void main(String[] args) {

        MovimentacaoBusiness movimentacao = new MoroBankMovimentacao();
        Conta samuel = new Conta(10022);
        System.out.println(samuel);

        movimentacao.depositar(samuel, 250.00);
        System.out.println(samuel);

        movimentacao.sacar(samuel, 50.00);
        System.out.println(samuel);

        movimentacao.sacar(samuel, 500.00);
        System.out.println(samuel);


        //Teste banco Franca
        Conta fabio = new Conta(9999, 1000.00);
        movimentacao.depositar(fabio, 1000.00);


        //teste do dudabank
        movimentacao = new DudaBankMovimentacao();

        Conta contaDuda = new Conta(4444);
        movimentacao.depositar(contaDuda, 1000D);
        System.out.println("ContaDuda");

        Emprestimo emprestimo = new DudaBankMovimentacao();
        emprestimo.emprestimo(contaDuda, 400000D);
        System.out.println(contaDuda);
    }
}
