package edu.eduardo.projetinhos.sistemaBancario;

public abstract class Conta {
    private double saldo;
     private int limiteSaque;

    public Conta() {
        this.saldo = 0;
        this.limiteSaque = 3;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    abstract void saque(double valor);

    abstract void deposito(double valor);

    abstract void mostrarSaldo();
}
