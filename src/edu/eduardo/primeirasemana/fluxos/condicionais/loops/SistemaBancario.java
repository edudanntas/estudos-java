package edu.eduardo.primeirasemana.fluxos.condicionais.loops;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float saldo = 0.00F;
        while (true) {
            int opcao;
            System.out.println("Selecione uma opção:");
            System.out.println("1: Deposito");
            System.out.println("2: Saque");
            System.out.println("3: Extrato");
            System.out.println("0: para o programa");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(" ");
                    System.out.println("Digite um valor para depositar: ");
                    double valorDeposito = scan.nextFloat();
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        System.out.println("Valor de: " + valorDeposito + " foi depositado com sucesso");
                        System.out.println(" ");
                        System.out.println("Seu saldo atual é de: " + "R$" + saldo);
                    } else {
                        System.out.println("Valor de depósito inválido");
                    }
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("Digite um valor para Sacar: ");
                    double valorSaque = scan.nextFloat();
                    if (valorSaque > 0 && valorSaque < saldo) {
                        saldo -= valorSaque;
                        System.out.println("Valor de: " + valorSaque + " foi sacado com sucesso");
                        System.out.println(" ");
                        System.out.println("Seu saldo atual é de: " + "R$" + saldo);
                    } else {
                        System.out.println("Valor de saque inválido");
                    }
                    break;
                case 3:
                    System.out.println("O seu saldo é de: " + saldo);
                    break;
                default:
                    return;
            }
        }
    }
}
