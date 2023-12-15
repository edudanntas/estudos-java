package edu.eduardo.primeirasemana.arrays.exercicios;
/**
 * <h1>Exercicio 01 - Ordem Inversa</h1>
 * <p>
 * Faça um Programa que leia um vetor de 7 números inteiros e mostre-os na ordem inversa
 * </p>
 *
 * @author Eduardo Dantas
 */
public class Exercicio01 {
    public static void main(String[] args) {
        int[] vetor = {1, 4, 5, 2, 7, 13, -9};

        System.out.print("Vetor: ");
        int count = 0;
        while (count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
