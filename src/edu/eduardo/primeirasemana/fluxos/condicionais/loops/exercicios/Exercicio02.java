package edu.eduardo.primeirasemana.fluxos.condicionais.loops.exercicios;

import java.util.Scanner;

/**
 * <h1>Exercicio 02 - Nota</h1>
 * <p>
 *     Nota: Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido.
 *     continue pedindo até que o usuário informe um valor válido.
 * </p>
 * @author Eduardo Dantas
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Nota inválida, tente novamente: ");
            nota = scan.nextInt();
        }
    }
}
