package edu.eduardo.segundasemana.poo.interfaces;

public class Executar {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(2,5));
        System.out.println(calculadora.subtrair(10,8));
        System.out.println(calculadora.multiplicar(7,42));
        System.out.println(calculadora.dividir(567,8));
    }
}
