package edu.eduardo.projetinhos.sistemaBancario;

public class ContaCorrente extends Conta {
    private static int proximoNumeroConta = 0;
    private String numeroConta;
    private String numeroAgencia;

    public ContaCorrente() {
        super();
        this.numeroConta = gerarNumeroConta();
        this.numeroAgencia = "0549";
    }

    private String gerarNumeroConta(){
        return String.format("%04d", proximoNumeroConta++);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    @Override
    public void saque(double valor) {
        double saldo = getSaldo();
        if ((valor < saldo) && (valor > 0)) {
            double novoSaldo = saldo - valor;
            setSaldo(novoSaldo);
            return;
        }
        System.out.println("O valor é inválido");
    }

    @Override
    public void deposito(double valor) {
        double saldo = getSaldo();
        if (valor > 0) {
            double novoSaldo = saldo += valor;
            setSaldo(novoSaldo);
            return;
        }
        System.out.println("O valor é inválido");
    }

    @Override
    public void mostrarSaldo() {
        double saldo = getSaldo();
        System.out.printf("Seu saldo é de: R$%.2f\n", saldo);
    }

    @Override
    public String toString() {
        return String.format("Conta Bancária:\nNúmero da Agência: %s\nNúmero da Conta: %s\nTipo de Conta: Conta Corrente\nSaldo: R$ %.2f",
                numeroAgencia, numeroConta, getSaldo());
    }
}
