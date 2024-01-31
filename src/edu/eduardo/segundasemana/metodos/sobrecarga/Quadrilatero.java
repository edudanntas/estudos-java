package edu.eduardo.segundasemana.metodos.sobrecarga;

public class Quadrilatero {
    public static void area(double lado) {
        System.out.println("A area do quadrado é: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("A area do triangulo é: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("A area do trapézio é: " + ((baseMaior + baseMenor) * altura) / 2);
    }
}
