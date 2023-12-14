package edu.eduardo.primeirasemana.fluxos.condicionais.loops.exercicios;

import java.util.Scanner;

/**
 * <h1>Exercicio 06 - Fatorial</h1>
 * <p>
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex.: 5!=5.4.3.2.1=120
 * </p>
 *
 * @author Eduardo Dantas
 */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        System.out.println("Digite um numero para fatorar: ");
        numero = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(numero+"! = ");
        for (int i = numero; i >= 1; i--) {
            multiplicacao *= i;
        }
        System.out.print(multiplicacao);
    }
}
