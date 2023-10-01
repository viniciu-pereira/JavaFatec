package ExerciciosParaProva.Exercicio5;

import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int numero = scanner.nextInt();

        if (numero < 0) {
            do {
                System.out.println("Insira um numero valido:");
                numero = scanner.nextInt();
            } while (numero < 0);
        }

        if(EPrimo(numero)){
            System.out.println("è primo");
        }else{
            System.out.println("Não é primo");
        }

    }

    public static boolean EPrimo(int numero) {
        
        /*
         * Verificando se é primo:
         * 
         *  O for verifica o numero inserido é divisel ´por 2, se for, ele não é primo porque pode ser
         * divisivel por mais de 1 e ele mesmo.
         * 
         *  Se o resultado retornar algum valor de resto nas divisões, ele é primo, pois nenhum outro 
         * numero obteve divisão exata.
         */
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
