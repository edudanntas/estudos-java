package edu.eduardo.projetinhos.sistemaBancario;

public class ContaPoupanca extends Conta{
    private int numeroAtual = 0;
    private int numeroContaPoupanca;
    private int agencia;

    public ContaPoupanca(){
        super();
        this.numeroContaPoupanca = ++numeroAtual;
        this.agencia = 1762;
    }

    @Override
    void saque(double valor) {

    }

    @Override
    void deposito(double valor) {
        double saldo = getSaldo();
        if (valor > 0) {
            double novoSaldo = saldo += valor;
            setSaldo(novoSaldo);
            return;
        }
        System.out.println("O valor é inválido");
    }

    @Override
    void mostrarSaldo() {
        double saldo = getSaldo();
        double novoSaldo = saldo * 1.95;
        System.out.println(novoSaldo);
    }
}
