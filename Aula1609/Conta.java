package Aula1609;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {

    private double saldo;
    private int numero;
    private double limite;
    private Double emprestimo;
    private List<String> extrato = new ArrayList<>();

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0D;
        this.limite = 0D;
    }

    public Conta(int numero, Double limite) {
        this.numero = numero;
        this.saldo = 0D;
    }

    public double getSaldo() {
        return saldo;
    }

    public void AtualizarSaldo(Double valor) {
        this.saldo += valor;

        String tipoMovimentacao = (valor < 0) ? "Saque" : "Deposito";

        String registro = new Date() + " " + tipoMovimentacao + " " + valor;

        extrato.add(registro);

    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Double emprestimo) {
        this.emprestimo = emprestimo;
    }

    @Override
    public String toString() {
        return "Conta [saldo=" + saldo + ", numero=" + numero + ", limite=" + limite + ", emprestimo=" + emprestimo
                + "]";
    }



}
