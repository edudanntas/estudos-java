package edu.eduardo.primeirasemana.arrays.exercicios;

import java.util.Random;

/**
 * <h1>Exercicio 03 - Números Aleatórios</h1>
 * <p>
 *  Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
 *  Ao final, mostre os números e seus sucessores.
 * </p>
 *
 * @author Eduardo Dantas
 */

public class Exercicio03 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numeros = random.nextInt(100);
            numerosAleatorios[i] = numeros;
        }

        for (int numero:numerosAleatorios){
            System.out.println(numero + " " + (numero + 1));
        }
    }
}
