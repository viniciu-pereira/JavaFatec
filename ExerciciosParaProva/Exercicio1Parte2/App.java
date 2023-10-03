package ExerciciosParaProva.Exercicio1Parte2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria um array para armazenar as vendas
        Venda[] vendas = new Venda[10];

        // Laço para ler as 10 vendas
        for (int i = 0; i < vendas.length; i++) {
            // Lê o código do produto
            System.out.print("Informe o código do produto: ");
            int codigoProduto = scanner.nextInt();

            // Lê o valor unitário
            System.out.print("Informe o valor unitário: ");
            double valorUnitario = scanner.nextDouble();

            // Lê a quantidade
            System.out.print("Informe a quantidade: ");
            int quantidade = scanner.nextInt();

            // Cria uma nova venda
            vendas[i] = new Venda(codigoProduto, valorUnitario, quantidade);
        }

        // Imprime o resumo das vendas
        System.out.println("Resumo das vendas:");
        for (Venda venda : vendas) {
            System.out.println(venda);
        }
    }
}
