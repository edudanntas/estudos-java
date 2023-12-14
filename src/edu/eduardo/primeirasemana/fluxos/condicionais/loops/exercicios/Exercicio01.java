package edu.eduardo.primeirasemana.fluxos.condicionais.loops.exercicios;

import java.util.Scanner;

/**
 * <h1>Exercicio 01 - Nome e Idade</h1>
 * <p>
 *     Nome e Idade: Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno
 *     e o segundo representando a sua idade.
 *     <b>Note:</b>Pare o programa inserindo o valor 0 no campo nome
 * </p>
 * @author Eduardo Dantas
 */

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = null;
        int idade;

        while (true){
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
    }
}
