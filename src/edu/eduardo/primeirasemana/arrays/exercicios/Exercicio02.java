package edu.eduardo.primeirasemana.arrays.exercicios;

import java.util.Scanner;

/**
 * <h1>Exercicio 02 - Consoantes</h1>
 * <p>
 *  Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.
 *  Imprima as consoantes.
 * </p>
 *
 * @author Eduardo Dantas
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];

        int totalDeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();
            if (!letra.matches("(?i)[aeiou]")){
                consoantes[count] = letra;
                totalDeConsoantes++;
            }
            count++;

        }while (count < consoantes.length);

        System.out.print("Consoantes: ");
        for(String consoante : consoantes){
            if (consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("\nTotal de consoantes: "+ totalDeConsoantes);
    }
}
