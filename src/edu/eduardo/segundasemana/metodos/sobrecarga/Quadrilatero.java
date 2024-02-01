package edu.eduardo.segundasemana.metodos.sobrecarga;

public class Quadrilatero {
    public static double area(double lado) {
        double resultado = lado * lado;
        System.out.println("A area do quadrado é: " + resultado);
        return resultado;
    }

    public static double area(double lado1, double lado2) {
        double resultado = lado1 * lado2;
        System.out.println("A area do triangulo é: " + resultado);
        return resultado;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        double resultado = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("A area do trapézio é: " + resultado);
        return resultado;
    }
}
