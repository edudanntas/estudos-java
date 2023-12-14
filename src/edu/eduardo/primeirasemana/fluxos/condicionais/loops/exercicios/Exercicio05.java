package edu.eduardo.primeirasemana.fluxos.condicionais.loops.exercicios;

import java.util.Scanner;

/**
 * <h1>Exercicio 05 - Tabuada</h1>
 * <p>
 * Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
 * <br>
 * Tabuada de 5:
 * <br>
 * 5 X 1 = 5
 * <br>
 * 5 X 2 = 10
 * <br>
 * ...
 * <br>
 * 5 X 10 = 50
 * <br>
 * </p>
 *
 * @author Eduardo Dantas
 */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.println("Escolha o numero que quer a tabuada: ");
        numero = scan.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        for(int i =0; i<11; i++){
            System.out.println(numero + " X " + i + " = "+(numero*i));
        }
    }


}
