package edu.eduardo.segundasemana.metodos;


public class Main {
    public static void main(String[] args) {
        Calculadora.somar(5, 19);
        Calculadora.multiplicar(67, 80);
        Calculadora.dividir(12,3);
        Calculadora.subtrair(78, 30);

        Emprestimo.calcularEmprestimo(1000, 8);
        Emprestimo.calcularEmprestimo(3870, Emprestimo.getOitoParcelas());
    }
}
