package edu.eduardo.segundasemana.metodos;

public class Calculadora {
    public static void somar(double valor1, double valor2){
        double resultado = valor1 + valor2;

        System.out.println("A soma de " + valor1 + " e " + valor2 + " é igual a: " + resultado );
    }
    public static void subtrair(double valor1, double valor2){
        double resultado = valor1 - valor2;

        System.out.println("A subtração de " + valor1 + " e " + valor2 + " é igual a: " + resultado );
    }
    public static void multiplicar(double valor1, double valor2){
        double resultado = valor1 * valor2;

        System.out.println("A multiplicação de " + valor1 + " e " + valor2 + " é igual a: " + resultado );
    }
    public static void dividir(double valor1, double valor2){
        double resultado = valor1 / valor2;

        System.out.println("A divisão de " + valor1 + " e " + valor2 + " é igual a: " + resultado );
    }
}
