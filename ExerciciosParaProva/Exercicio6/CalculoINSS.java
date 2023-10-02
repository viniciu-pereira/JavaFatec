package ExerciciosParaProva.Exercicio6;

import java.util.Scanner;

public class CalculoINSS {

    public static void main(String[] args) {

        CalculoSalario calculo = new CalculoSalario();
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o salario:");
        int ValorSalario = leitura.nextInt();

        calculo.setValorSalario(ValorSalario);

        double totalINSS = 0D;

        // definindo valores da tabela
        if (calculo.getValorSalario() > 0 && calculo.getValorSalario() < 1212) {
            calculo.setAliquota(0.75);
            calculo.setDeducao(0);

        }
        if (calculo.getValorSalario() > 1212 && calculo.getValorSalario() < 2427.35) {
            calculo.setAliquota(0.09);
            calculo.setDeducao(18.18);

        }
        if (calculo.getValorSalario() > 2427.35 && calculo.getValorSalario() < 3641.03) {
            calculo.setAliquota(0.12);
            calculo.setDeducao(91);

        }
        if (calculo.getValorSalario() > 3641.04 && calculo.getValorSalario() < 7087.22) {
            calculo.setAliquota(0.14);
            calculo.setDeducao(163.82);
        }

        totalINSS = (calculo.getValorSalario() * calculo.getAliquota()) - calculo.getDeducao();

        System.out.println("##########################\n");
        System.out.println("CALCULADORA DE INSS\n");
        System.out.println("##########################\n");
        System.out.println("Salario Bruto...: " + ValorSalario);
        System.out.println("Aliquota INSS...:" + calculo.getAliquota() * 100D);
        System.out.println("Desconto INSS...: " + totalINSS);
        System.out.println("Salario liquido...:" + (ValorSalario - totalINSS));
    }
}