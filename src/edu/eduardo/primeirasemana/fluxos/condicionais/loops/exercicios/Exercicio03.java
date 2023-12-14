package edu.eduardo.primeirasemana.fluxos.condicionais.loops.exercicios;

import java.util.Scanner;

/**
 * <h1>Exercicio 03 - Maior e Media</h1>
 * <p>
 * Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.
 * </p>
 *
 * @author Eduardo Dantas
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if (numero > maior) maior = numero;
            soma = soma + numero;
            count++;
        } while (count < 5);

        System.out.println("O maior numero é: "+maior);
        int media = soma/count;
        System.out.println("A Média dos numeros é: "+media);
    }
}
