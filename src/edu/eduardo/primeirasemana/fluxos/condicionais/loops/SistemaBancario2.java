package edu.eduardo.primeirasemana.fluxos.condicionais.loops;

import java.util.Scanner;

public class SistemaBancario2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double saldo = 0;

        while (true){
            System.out.println("Escolha uma opção para continuar: ");
            System.out.println("1: Depositar");
            System.out.println("2: Sacar");
            System.out.println("3: Ver Saldo");
            System.out.println("4: Sair");
            int opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Insira o valor que deseja depositar: ");
                    double valorDeposito = scan.nextDouble();
                    saldo = depositar(saldo, valorDeposito);
                    break;
                case 2:
                    System.out.println("Insira o valor que deseja sacar: ");
                    double valorSaque = scan.nextDouble();
                    saldo = sacar(saldo, valorSaque);
                    break;
                case 3:
                    System.out.println("O seu saldo é de: R$"+saldo+"\n");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }

    public static double depositar(double saldo, double valorParaDeposito){
        if(valorParaDeposito > 0){
            System.out.println("Depositando o valor de: R$"+valorParaDeposito);
            return saldo + valorParaDeposito;
        }else{
            System.out.println("Valor inválido para depósito!");
        }
        return saldo;
    }

    public static double sacar(double saldo, double valorParaSaque){
        if(valorParaSaque > 0){
            if(valorParaSaque <= saldo){
                System.out.println("Sacando o valor de: R$"+valorParaSaque);
                 return saldo - valorParaSaque;
            } else{
                System.out.println("Você não tem saldo suficiente para realizar o saque!");
            }
        } else{
            System.out.println("Valor inválido para saque!");
        }

        return saldo;
    }
}
