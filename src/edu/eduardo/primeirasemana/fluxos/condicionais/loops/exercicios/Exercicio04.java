package edu.eduardo.primeirasemana.fluxos.condicionais.loops.exercicios;

import java.util.Scanner;

/**
 * <h1>Exercicio 04 - Pares e Impares</h1>
 * <p>
 * Faça um programa que peça N números inteiros.
 * Calcule e mostre a quantidade de números pares e a quantidade de números impares.
 * </p>
 *
 * @author Eduardo Dantas
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int quantidadeNumeros;
        System.out.println("Informe a quantidade de numeros que deseja inserir: ");
        quantidadeNumeros = scan.nextInt();

        int numero;
        int count = 0;
        int numerosPares = 0, numerosImpares = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if(numero % 2 == 0)
                numerosPares++;
            else
                numerosImpares++;
            count++;
        }while(count < quantidadeNumeros);

        System.out.println("Quantidade de numeros Pares: "+ numerosPares);
        System.out.println("Quantidade de numeros Impares: "+ numerosImpares);
    }
}
