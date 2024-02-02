package edu.eduardo.segundasemana.poo.interfaces;

public class Calculadora implements OperacaoMatematica {
    public double somar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double subtrair(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double dividir(double valor1, double valor2) {
        return valor1 / valor2;
    }

    public double raizQuadrada(double valor){
        return Math.sqrt(valor);
    }
}
